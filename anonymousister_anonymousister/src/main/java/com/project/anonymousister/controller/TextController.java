package com.project.anonymousister.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.anonymousister.models.TextModel;
import com.project.anonymousister.service.TextService;

@RestController
@RequestMapping("/v2")
public class TextController {
	
	
	@Autowired
	TextService textService;
	
	public void setTextService(TextService textService) {
		this.textService = textService;
	}

	@GetMapping("/getallmessages")
	public List<TextModel> getAllAnonymousMessages(){
		return (List<TextModel>) textService.getAllAnonymousMessages();
	}
	
	@RequestMapping(path = "/postmymessage", consumes = MediaType.APPLICATION_JSON_VALUE)
	public TextModel postMessage(@RequestBody TextModel text) {
		return textService.postMessage(text);
		
	}
	
	

}
