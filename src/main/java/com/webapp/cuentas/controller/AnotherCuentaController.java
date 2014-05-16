package com.webapp.cuentas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AnotherCuentaController {
	
	@RequestMapping(value="formulario",method=RequestMethod.GET)
	public String mostrarFormulario(){
		System.out.println("....");
		return "cuenta/formulario";
	}
	
}
