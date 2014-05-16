package com.webapp.cuentas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RespuestasController {
	
	@RequestMapping("/respuestas")
	public String respuestas(){
		return "respuestas";
	}
}
