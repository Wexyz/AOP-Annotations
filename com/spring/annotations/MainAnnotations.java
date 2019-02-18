package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotations {
	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from container; with SPECIFIED NAME
		InterfacePojo pojo1 = context.getBean("componentpojo", InterfacePojo.class);
		
		// get bean from container; with DEFAULT NAME
		// DEFAULT NAME = same name as class; first character lower cased
		InterfacePojo pojo2 = context.getBean("defaultNameAnnotationPojo", InterfacePojo.class);
		
		// call methods
		System.out.println(pojo1.print());
		System.out.println(pojo2.print());
		
		//close
		context.close();
	}
}
