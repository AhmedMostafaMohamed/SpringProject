package com.project.SpringProject.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sub_Category {
	
	private String ID;
	private String Name;
	
	
	public Sub_Category(@JsonProperty("id")String iD,@JsonProperty("name") String name) {
		super();
		ID = iD;
		Name = name;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	
	
	
	
	
	
	

}
