package com.webapp.cuentas;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.cuentas.dao.CuentaDAO;
import com.webapp.cuentas.modelo.Cuenta;

@Controller
public class CuentaController {
	
	private CuentaDAO dao;
	
	@Autowired
	public CuentaController(CuentaDAO dao) {
		this.dao = dao;
	}
	
	public CuentaDAO getDao() {
		return dao;
	}
	
	public CuentaController() {
	}
	
	@RequestMapping("/form")
	public String initFormulario(){
		return "cuenta/formulario";
	}
	
	@RequestMapping("/agregarCuenta")
	public String guardarFormulario(@Valid Cuenta cuenta, BindingResult result){
		if(result.hasErrors()){
			return "cuenta/formulario";
		}
		System.out.println("La cuenta agregada es "
				+ cuenta.getDescripcion());
		dao.agregar(cuenta);
		return "cuenta/cuenta-agregada";
	}
	
	@RequestMapping("/listarCuentas")
	public String listarCuentas(Model mv){
		List<Cuenta> cuentas = dao.listar();
		mv.addAttribute("cuentas",cuentas);
		return "cuenta/lista";
	}
	
	@RequestMapping("/eliminarCuenta")
	public String remove(Cuenta cuenta){
		dao.eliminar(cuenta);
		return "forward:listarCuentas";
	}
	
	@RequestMapping("/muestraCuenta")
	public String muestra(Long id, Model model){
		model.addAttribute("cuenta", dao.buscarPorId(id));
		return "cuenta/muestra";
	}
	
	@RequestMapping("/modificarCuenta")
	public String modificar(Cuenta cuenta){
		dao.modificar(cuenta);
		return "redirect:listarCuentas";
	}
	
	@RequestMapping("/pagarCuenta")
	public void pagar(Long id, HttpServletResponse response){
		System.out.println("Emitiendo metodo pagar...");
		dao.pagar(id);
		response.setStatus(200);
	}
}
