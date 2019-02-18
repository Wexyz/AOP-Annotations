package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component("componentpojo")
public class AnnotationPojo implements InterfacePojo{

	@Override
	public String print() {
		return "Annotation Pojo String Printed";
	}
	
}
