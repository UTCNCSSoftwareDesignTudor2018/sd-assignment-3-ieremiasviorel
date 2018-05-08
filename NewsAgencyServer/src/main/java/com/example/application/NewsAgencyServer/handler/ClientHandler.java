package com.example.application.NewsAgencyServer.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

import com.example.application.NewsAgencyServer.communication.message.CommResponse;
import com.example.application.NewsAgencyServer.communication.message.GetArticlesRequest;
import com.example.application.NewsAgencyServer.communicaton.RequestExecutor;
import com.example.application.NewsAgencyServer.communicaton.RequestInterpretor;

public class ClientHandler extends Thread implements Observer {

	private RequestInterpretor requestInterpretor;

	private RequestExecutor requestExecutor;

	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;

	public ClientHandler(Socket clientSocket) throws IOException {
		this.requestInterpretor = BeanUtil.getBean(RequestInterpretor.class);
		this.requestExecutor = BeanUtil.getBean(RequestExecutor.class);
		this.clientSocket = clientSocket;
		this.out = new PrintWriter(this.clientSocket.getOutputStream(), true);
		this.in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
	}

	@Override
	public void update(Observable o, Object arg) {

	}

	@Override
	public void run() {

		GetArticlesRequest request = new GetArticlesRequest(Integer.valueOf(1));
		CommResponse resp = requestExecutor.executeRequest(request);
		try {
			out.println(resp.toJson());
		} catch (IOException e) {
			e.printStackTrace();
		}

		String line = null;
		try {
			while (in.readLine() != null) {
				line = in.readLine();
				CommResponse response = requestInterpretor.interpretRequest(line);
				try {
					out.println(response.toJson());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
