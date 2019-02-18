package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class DIPojo implements DependentInterface{

	
	@Override
	public String DIprint() {
		// TODO Auto-generated method stub
		System.out.println("Calling DIPojo");
		return "Dependent Interface String Printed";
	}
}
