package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class DefaultNameAnnotationPojo implements InterfacePojo{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Default Name Annotation Pojo String Printed";
	}
	
}
