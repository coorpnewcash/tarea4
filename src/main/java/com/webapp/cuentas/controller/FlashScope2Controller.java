package com.webapp.cuentas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("attribute1")
public class FlashScope2Controller {
	
	@RequestMapping(value="/url_handled_by_controller",method=RequestMethod.GET)
	public void handleGetRequest(@ModelAttribute("attribute1") String attribute1, @ModelAttribute("message") String message){
		System.out.println(attribute1);
		System.out.println(message);
	}
}
