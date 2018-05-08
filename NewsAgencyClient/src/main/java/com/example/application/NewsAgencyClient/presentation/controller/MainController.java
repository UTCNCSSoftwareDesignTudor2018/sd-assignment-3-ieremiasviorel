package com.example.application.NewsAgencyClient.presentation.controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.PrintWriter;

import com.example.application.NewsAgencyClient.communication.message.GetFullArticleRequest;
import com.example.application.NewsAgencyClient.presentation.view.MainView;

public class MainController {

	private PrintWriter out;
	
	private MainView mainView;
	
	public MainController(PrintWriter out, MainView mainView) {
		this.out = out;
		this.mainView = mainView;
		for (int i = 0; i < 6; i++) {
			mainView.addPanelSelectListener(i, new SelectArticleListener(i));
		}
	}
	
	class SelectArticleListener implements MouseListener {
		
		int panelId;
		
		SelectArticleListener(int panelId) {
			this.panelId = panelId;
		}
		
		//@Override
		public void actionPerformed(ActionEvent e) {
			String selectedArticleTitle = mainView.getSelectedArticleTitle(panelId);
			GetFullArticleRequest request = new GetFullArticleRequest(selectedArticleTitle);
			try {
				out.println(request.toJson());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			System.err.println("Here");
			String selectedArticleTitle = mainView.getSelectedArticleTitle(panelId);
			GetFullArticleRequest request = new GetFullArticleRequest(selectedArticleTitle);
			try {
				out.println(request.toJson());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			System.err.println("Here");
			String selectedArticleTitle = mainView.getSelectedArticleTitle(panelId);
			GetFullArticleRequest request = new GetFullArticleRequest(selectedArticleTitle);
			try {
				out.println(request.toJson());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			System.err.println("Here");
			String selectedArticleTitle = mainView.getSelectedArticleTitle(panelId);
			GetFullArticleRequest request = new GetFullArticleRequest(selectedArticleTitle);
			try {
				out.println(request.toJson());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			System.err.println("Here");
			String selectedArticleTitle = mainView.getSelectedArticleTitle(panelId);
			GetFullArticleRequest request = new GetFullArticleRequest(selectedArticleTitle);
			try {
				out.println(request.toJson());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			System.err.println("Here");
			String selectedArticleTitle = mainView.getSelectedArticleTitle(panelId);
			GetFullArticleRequest request = new GetFullArticleRequest(selectedArticleTitle);
			try {
				out.println(request.toJson());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
