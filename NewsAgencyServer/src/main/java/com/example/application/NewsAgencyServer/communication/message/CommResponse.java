package com.example.application.NewsAgencyServer.communication.message;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class CommResponse extends CommPackage {
	
	private static final long serialVersionUID = 1L;
	
	protected static final ObjectMapper objectMapper = new ObjectMapper();

	public CommResponse() {
		super();
	}
	
	public CommResponse(String message) {
		super(message);
	}
	
	public String toJson() throws JsonGenerationException, JsonMappingException, IOException {
		return objectMapper.writeValueAsString(this);
	}
}
