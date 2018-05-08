package com.example.application.NewsAgencyClient;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.example.application.NewsAgencyClient.presentation.controller.StartViewController;

public class NewsAgencyClientApplication {

	public static void main(String[] args) throws ClassNotFoundException, IOException, ParseException {

		// String hostName = args[0];
		// int portNumber = Integer.parseInt(args[1]);

//		String hostName = "localhost";
//		int portNumber = 10;
//
//		Socket echoSocket = null;
//		
//		try {
//			echoSocket = new Socket(hostName, portNumber);
//			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
//			BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
//			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
//
//			int id;
//
//			ObjectMapper om = new ObjectMapper();
//
//			String line = in.readLine();
//			
//			GetArticlesResponse response = (GetArticlesResponse) om.readValue(line, GetArticlesResponse.class);
//			
//			for (ArticleBasic art : response.getArticles()) {
//				System.out.println(art.getTitle());
//			}
//			
//			do {
//				id = Integer.parseInt(stdIn.readLine());
//				out.println(Long.valueOf(id));
//				Writer wr = om.readValue(in.readLine(), Writer.class);
//				System.out.println(wr.toString());
//			} while (id != -1);
//
//		} catch (
//
//		UnknownHostException e) {
//			System.err.println("Don't know about host " + hostName);
//			System.exit(1);
//		} catch (IOException e) {
//			System.err.println("Couldn't get I/O for the connection to " + hostName);
//			System.exit(1);
//		} finally {
//			echoSocket.close();
//		}
		
		//new StartController(new StartView());
		new StartViewController();
	}
}