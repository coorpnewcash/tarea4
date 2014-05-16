package com.webapp.cuentas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.cuentas.dao.UsuarioDAO;
import com.webapp.cuentas.modelo.Usuario;

@Controller
public class UsuarioController {
	
	@RequestMapping(value={"/","/index"})
	public String paginaInicio(){
		return "index";
	}
	
	@RequestMapping("/loginForm")
	public String formulario(){
		return "usuario/login";
	}
	
	@RequestMapping("/efectuaLogin")
	public String efectuaLogin(Usuario usuario, HttpSession session){
		UsuarioDAO usuarioDao = new UsuarioDAO();
		if(usuarioDao.existeUsuario(usuario)){
			session.setAttribute("usuarioLogueado", usuario);
			return "menu";
		}
		return "redirect:loginForm";
	}
	
	@RequestMapping("/logout")
	public String saliendo(HttpSession session){
		session.invalidate();
		return "redirect:loginForm";
	}
	
}
