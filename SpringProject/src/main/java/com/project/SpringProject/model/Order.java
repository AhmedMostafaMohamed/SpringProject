package com.project.SpringProject.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
	
	private String ID;
	private Date date;
	
	
	public Order(@JsonProperty("id")String iD,Date date) {
		super();
		ID = iD;
		this.date = date;
		
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	


	

}
