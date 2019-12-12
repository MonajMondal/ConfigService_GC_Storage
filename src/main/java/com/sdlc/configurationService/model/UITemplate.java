package com.sdlc.configurationService.model;

import java.util.EnumMap;

public class UITemplate {

	private Client client;
	private EnumMap<TemplateType, String> templateMap = new EnumMap<TemplateType, String>(TemplateType.class);
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public EnumMap<TemplateType, String> getTemplateMap() {
		return templateMap;
	}
	public void setTemplateMap(EnumMap<TemplateType, String> templateMap) {
		this.templateMap = templateMap;
	} 

	
}
