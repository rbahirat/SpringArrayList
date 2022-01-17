package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.CollectionModel;

public class CollectionMain {
	
	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring_bean.xml");
		 CollectionModel cm =(CollectionModel) context.getBean("c");
		 cm.display();
		 cm.display2();
	
	
	}
}
