package com.spring.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowiring {

	public static void main(String[] args) {
		// autowiring = auto injects implementations to class
		// types: constructor, setter, field
		
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		InterfacePojo pojo = context.getBean("autowirePojo",InterfacePojo.class);
		
		System.out.println(pojo.print());
		System.out.println(pojo.diprint());
		
		context.close();
		
	}

}
