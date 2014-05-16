package com.webapp.cuentas.modelo;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;


public class Contacto {
	
	@NotEmpty
	private String name;
	@NotEmpty
	@Pattern(regexp=".+@.+\\.[a-z]+")
	private String email;
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	
	
}
