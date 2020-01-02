package com.sdlc.configurationService.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sdlc.configurationService.model.response.ClientTemplateResponse;
import com.sdlc.configurationService.model.response.UIComponent;
import com.sdlc.configurationService.model.response.UIService;
import com.sdlc.servicerulerepo.ConfigurableClientTemplate;

@Service
public class ResponseBuilderService {

	
	public ClientTemplateResponse buildResponse(ConfigurableClientTemplate clientTemplate) {
		ClientTemplateResponse clientResponse = new ClientTemplateResponse();
		
		clientResponse.setClientID(clientTemplate.getClientID());
		clientResponse.setClient(getClientName(clientTemplate.getClientID()));
		
		List<UIComponent> componentList = new ArrayList<UIComponent>();
		for(String component : clientTemplate.getComponentList()) {
			componentList.add(getComponent(component));
		}
		clientResponse.setComponents(componentList);

		List<UIService> serviceList = new ArrayList<UIService>();
		for(String service : clientTemplate.getServiceList()) {
			serviceList.add(getService(service));
		}
		clientResponse.setServices(serviceList);
		
		return clientResponse;
		
	}
	
	
	public UIComponent getComponent(String name) {
		return UICompMap.get(name);
	}
	
	public UIService getService(String name) {
		return UIServiceMap.get(name);
	}
	
	public String getClientName(String clientId) {
		return clientMap.get(clientId);
	}

	static Map<String,UIComponent> UICompMap = new HashMap<String,UIComponent>();
	static Map<String,UIService> UIServiceMap = new HashMap<String,UIService>();
	static Map<String,String> clientMap = new HashMap<String,String>();


   static {
	   UICompMap.put("member-details", new UIComponent("member-details","http://localhost:8085/main.js","<app-member-details></app-member-details>"));
	   UICompMap.put("plan-progress", new UIComponent("plan-progress","http://localhost:8082/main.js","<app-plan-progress></app-plan-progress>"));
	   UICompMap.put("plan-progress", new UIComponent("idcard","http://localhost:8087/main.js","<app-idcard></app-idcard>"));

	   UIServiceMap.put("service1", new UIService("service1","http://abc"));
	   UIServiceMap.put("service2", new UIService("service3","http://mnp"));
	   UIServiceMap.put("service3", new UIService("service3","http://xyz"));
	   
	   clientMap.put("MN", "Minesota");
	   clientMap.put("DW", "Delware");
	   clientMap.put("WM", "Woyming");
	   clientMap.put("ND", "North Dakoda");




   }

}
