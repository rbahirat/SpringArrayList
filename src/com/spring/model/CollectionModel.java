package com.spring.model;

import java.util.ArrayList;
import java.util.Map;

public class CollectionModel {
	
	private ArrayList<String> nameList;
	private Map<String, Integer> map;
	
	

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public ArrayList<String> getNameList() {
		return nameList;
	}

	public void setNameList(ArrayList<String> nameList) {
		this.nameList = nameList;
	}

	public void display() {
		System.out.println("All Student Names: ");
		for(String s:nameList) {
			System.out.println(s);
		}
		
	}
	
	public void display2() {
		System.out.println("All Map Elements Are: ");
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("key:"+entry.getKey()+"....value:"+entry.getValue());
		}
		
	}
	
	
}
