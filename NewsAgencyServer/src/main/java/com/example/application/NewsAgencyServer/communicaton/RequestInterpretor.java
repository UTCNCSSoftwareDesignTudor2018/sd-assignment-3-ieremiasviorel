package com.example.application.NewsAgencyServer.communicaton;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.NewsAgencyServer.communication.message.CommPackage;
import com.example.application.NewsAgencyServer.communication.message.CommResponse;
import com.example.application.NewsAgencyServer.communication.message.GetArticlesRequest;
import com.example.application.NewsAgencyServer.communication.message.LoginRequest;
import com.example.application.NewsAgencyServer.communication.message.MessageType;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RequestInterpretor {

	@Autowired
	protected RequestExecutor requestExecutor;
	
	protected static ObjectMapper objectMapper = new ObjectMapper();
	
	public CommResponse interpretRequest(String requestJson) throws JsonParseException, JsonMappingException, IOException {
		
		CommPackage command = objectMapper.readValue(requestJson, CommPackage.class);
		
		if (command.getMessage().equals(MessageType.LOGIN_REQUEST.type)) {
			return requestExecutor.executeRequest(objectMapper.readValue(requestJson, LoginRequest.class));
		}
		else if (command.getMessage().equals(MessageType.GET_ARTICLES_REQUEST.type)) {
			return requestExecutor.executeRequest(objectMapper.readValue(requestJson, GetArticlesRequest.class));
		}
		else {
			return null;
		}
	}
}
