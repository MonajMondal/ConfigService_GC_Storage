package com.sdlc.configurationService.model;

public enum TemplateType {

	LOGIN("Login Page Template"),
	DASHBOARD("Grid"),
	SERVICE("Graphical");
	
	private String value;
	
	
	TemplateType(String value){
		this.value=value;
	}
	
	

}
