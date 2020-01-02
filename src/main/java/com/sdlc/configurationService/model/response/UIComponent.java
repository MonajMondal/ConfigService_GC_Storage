package com.sdlc.configurationService.model.response;

public class UIComponent {

	private String name;
	private String url;
	private String componentTag;
	
	
	public UIComponent(String name, String url, String componentTag) {
		super();
		this.name = name;
		this.url = url;
		this.componentTag = componentTag;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getComponentTag() {
		return componentTag;
	}
	public void setComponentTag(String componentTag) {
		this.componentTag = componentTag;
	}
	
	
	
	@Override
	public String toString() {
		return "UIComponent [name=" + name + ", url=" + url + ", componentTag=" + componentTag + "]";
	}
	
}
