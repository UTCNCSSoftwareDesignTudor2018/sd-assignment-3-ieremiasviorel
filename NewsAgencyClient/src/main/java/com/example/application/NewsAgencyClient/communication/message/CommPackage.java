package com.example.application.NewsAgencyClient.communication.message;

import java.io.Serializable;

public abstract class CommPackage implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String message;

	public CommPackage() {
		this.message = null;
	}
	
	public CommPackage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
