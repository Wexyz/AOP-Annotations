package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowirePojo implements InterfacePojo{

	private DependentInterface dInterface;
	
	// FIELD INJECTION = no need for setter
	 
	//Default constructor
	public AutowirePojo() {
		System.out.println("diagnostic: Default constructor called");
	}
	
	// setter method for injection
	// SETTER INJECTION
	@Autowired
	public void setdInterface(DependentInterface dInterface) {
		System.out.println("diagnostic: setter method called");
		this.dInterface = dInterface;
	}
	
	//METHOD INJECTION
	@Autowired
	public void arbitraryMethod(DependentInterface dInterface) {
		System.out.println("diagnostic: Arbitrary Method called");
		this.dInterface = dInterface;
	}
	
	
	// autowired annotation removes XML configurations for dependencies
	// CONSTRUCTOR INJECTION
	@Autowired
	public AutowirePojo(DependentInterface dInterface) {
		super();
		this.dInterface = dInterface;
	}
	
	
	
	@Override
	public String print() {
		return "Annotation Pojo String Printed";
	}

	@Override
	public String diprint() {
		System.out.println("calling DI Print");
		return dInterface.DIprint();
		
	}
	
}
