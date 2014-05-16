package com.webapp.cuentas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FlashScope1Controller {
	
	@RequestMapping(value="flashScope",method=RequestMethod.GET)
	public String handleFormSubmission(final RedirectAttributes redirectAttributes){
		redirectAttributes.addFlashAttribute("attribute1", "Julian");
		redirectAttributes.addFlashAttribute("message", "This is flash attribute");
		return "redirect:/url_handled_by_controller";
	}
}
