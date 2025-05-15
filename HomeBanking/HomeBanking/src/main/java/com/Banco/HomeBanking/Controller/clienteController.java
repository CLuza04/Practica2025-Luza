package com.Banco.HomeBanking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Banco.HomeBanking.Entity.cliente;
import com.Banco.HomeBanking.service.InterCliente;

@Controller
public class clienteController {
	@Autowired
	private InterCliente userService;
	
	@GetMapping ("/listaCliente")
	public String detalleCliente (Model model) {
		model.addAttribute("cliente", userService.obtenerLista());
		return "cliente/listaCliente";
	}

	@GetMapping ("/altaCliente")
	public String AltaCliente (Model model) {
		cliente user=new cliente();
		model.addAttribute("cliente", user);
		return "cliente/altaCliente";
	}

	@PostMapping ("/guardar") 
	public String guardar (cliente client) {
		userService.guardar(client);
		return "redirect:/listaCliente";
	}
	
	@GetMapping ("/listaCliente")
	public void eliminar () {
		
	}
}
