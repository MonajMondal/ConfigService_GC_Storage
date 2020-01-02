package com.sdlc.configurationService.model.response;

public class UIService {

	private String name;
	private String endpoint;
	
	
	public UIService(String name, String endpoint) {
		super();
		this.name = name;
		this.endpoint = endpoint;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	@Override
	public String toString() {
		return "UIService [name=" + name + ", endpoint=" + endpoint + "]";
	}
	
	
}
