package com.project.SpringProject.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	private float Price;
	private int Quantity;
	private UUID id;
	private String Code;
	private String Cat_ID;
	private String Sub_ID;
	private String Name;
	public Item(@JsonProperty("price")float price,@JsonProperty("quantity") int quantity,@JsonProperty("id") UUID id,
			@JsonProperty("code")String code,@JsonProperty("category_ID") String cat_ID,
			@JsonProperty("SubCategory_ID") String sub_ID,@JsonProperty("name") String name) {
		super();
		Price = price;
		Quantity = quantity;
		this.id = id;
		Code = code;
		Cat_ID = cat_ID;
		Sub_ID = sub_ID;
		Name = name;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getCat_ID() {
		return Cat_ID;
	}
	public void setCat_ID(String cat_ID) {
		Cat_ID = cat_ID;
	}
	public String getSub_ID() {
		return Sub_ID;
	}
	public void setSub_ID(String sub_ID) {
		Sub_ID = sub_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
	

}
