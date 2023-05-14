package com.project.anonymousister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.anonymousister.dao.TextDao;
import com.project.anonymousister.models.TextModel;

@Service
public class TextService {

	@Autowired
	TextDao textDao;

	public TextService(TextDao textDao) {
		this.textDao = textDao;
	}

	public List<TextModel> getAllAnonymousMessages(){
		return textDao.findAll();
	}
	
	
	public TextModel postMessage(TextModel text) {
		textDao.save(text);
		return textDao.getById(text.getClientID());
		
	}
	
	
	
	
	
}
