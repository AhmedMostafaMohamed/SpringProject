package com.project.SpringProject.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.project.SpringProject.model.Category;
import com.project.SpringProject.model.Item;
import com.project.SpringProject.model.Order;
import com.project.SpringProject.model.Sub_Category;


public class DataAccess {
	List<Category> CategoriesDB = new ArrayList<Category>();
	List<Sub_Category> SubDB = new ArrayList<Sub_Category>();
	List<Item> AllItemsDB = new ArrayList<Item>();
	Map<Order, List<Item>> Orders = new HashMap<Order, List<Item>>();
	
	
	

}
