package com.sdlc.configurationService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sdlc.configurationService.model.Client;
import com.sdlc.configurationService.model.TemplateType;
import com.sdlc.configurationService.model.UITemplate;

@RestController
public class ConfigPublisher {

	
	@GetMapping("/service/getTemplate/client/{clientId}/templateType/{templateType}")
	public String getTemplate(@PathVariable("clientId") String clientId,@PathVariable("templateType")TemplateType templateType){
	
		
		String[] loginTemplate={"loginTemplate1","loginTemplate2","loginTemplate3"};
		String[] serviceTemplate={"serviceTemplate1","serviceTemplate2","serviceTemplate3"};
		String[] dashboardTemplate={"dashboardTemplate1","dashboardTemplate2","dashboardTemplate3"};
		
		String template = null;
		
		switch(clientId){
			case "MN":
				switch(templateType){
				case LOGIN:
					template=loginTemplate[0];
					break;
				case DASHBOARD:
					template=dashboardTemplate[1];
					break;
				case SERVICE:
					template=serviceTemplate[2];
				}
				break;
				
			case "ND":
				switch(templateType){
				case LOGIN:
					template=loginTemplate[2];
					break;
					
				case DASHBOARD:
					template=dashboardTemplate[0];
					break;
				case SERVICE:
					template=serviceTemplate[1];
				}
			}
		
			return template;
	}
	
	
	@GetMapping("/service/getClientTemplate/client/{client}")
	public UITemplate getClientTemplate(@PathVariable("client") Client client ){
	
		
		String[] loginTemplate={"template1","template2","template3"};
		String[] serviceTemplate={"template10","template20","template30"};
		String[] dashboardTemplate={"template100","template200","template300"};
		
		String template = null;
		
		
		UITemplate responseTemplate = new UITemplate();
		responseTemplate.setClient(client);
		
		switch(client){
			case MN:
				responseTemplate.getTemplateMap().put(TemplateType.LOGIN, loginTemplate[0]);
				responseTemplate.getTemplateMap().put(TemplateType.DASHBOARD, dashboardTemplate[1]);
				responseTemplate.getTemplateMap().put(TemplateType.SERVICE, serviceTemplate[1]);
				break;
				
			case ND:
				responseTemplate.getTemplateMap().put(TemplateType.LOGIN, loginTemplate[2]);
				responseTemplate.getTemplateMap().put(TemplateType.DASHBOARD, dashboardTemplate[0]);
				responseTemplate.getTemplateMap().put(TemplateType.SERVICE, serviceTemplate[1]);
				break;
			case WM:
				responseTemplate.getTemplateMap().put(TemplateType.LOGIN, loginTemplate[1]);
				responseTemplate.getTemplateMap().put(TemplateType.DASHBOARD, dashboardTemplate[2]);
				responseTemplate.getTemplateMap().put(TemplateType.SERVICE, serviceTemplate[0]);
			}
		
			return responseTemplate;
	}
}
