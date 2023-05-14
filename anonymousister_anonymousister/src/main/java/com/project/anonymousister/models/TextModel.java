package com.project.anonymousister.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TextModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ClientID;
	private String Clientext;
	
	public TextModel() {}
	public TextModel(Integer clientID, String clientext) {
		ClientID = clientID;
		Clientext = clientext;
	}
	
	public TextModel(Integer clientID) {
		ClientID = clientID;
	}
	public TextModel(String clientext) {
		Clientext = clientext;
	}
	public Integer getClientID() {
		return ClientID;
	}
	public void setClientID(Integer clientID) {
		ClientID = clientID;
	}
	public String getClientext() {
		return Clientext;
	}
	public void setClientext(String clientext) {
		Clientext = clientext;
	}

	

	
	
}
