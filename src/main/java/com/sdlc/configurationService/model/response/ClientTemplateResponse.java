package com.sdlc.configurationService.model.response;

import java.util.List;

public class ClientTemplateResponse {
 
	private String clientID;
	private String client;
	
	private List<UIComponent> components;
	private List<UIService> services;

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public List<UIComponent> getComponents() {
		return components;
	}

	public void setComponents(List<UIComponent> components) {
		this.components = components;
	}

	public List<UIService> getServices() {
		return services;
	}

	public void setServices(List<UIService> services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "ClientTemplateResponse [clientID=" + clientID + ", client=" + client + ", components=" + components
				+ ", services=" + services + "]";
	}
	
}
