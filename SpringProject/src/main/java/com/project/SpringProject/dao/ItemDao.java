package com.project.SpringProject.dao;

import java.util.UUID;

import com.project.SpringProject.model.Item;




public interface ItemDao {
	int InsertItem(UUID id,Item item);
	
	
default int addItem(Item item) {
		
		UUID id =UUID.randomUUID();
		return InsertItem(id,item);
	}

}
