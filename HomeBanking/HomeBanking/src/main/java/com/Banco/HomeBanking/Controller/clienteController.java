package com.Banco.HomeBanking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Banco.HomeBanking.Entity.cliente;
import com.Banco.HomeBanking.service.InterCliente;

@Controller
public class clienteController {
	@Autowired
	private InterCliente userService;
	

	@GetMapping ("/menu")
	public String Menu () {
		return "cliente/menu";
	}
	
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

	@PostMapping ("/eliminar")
	public String eliminar(@RequestParam Integer iD) {
		userService.eliminarCliente(iD);
		return "redirect:/listaCliente";
	}
	
	
	@PostMapping ("/editar")
	public String editar(@RequestParam("iD") Integer iD, Model model) {
		cliente clie = userService.buscarCliente(iD);
		model.addAttribute("cliente", clie);
		return "cliente/editarCliente"; 
	}

	@PostMapping ("/actualizar")
	public String actualizarCliente (cliente client) {
		userService.actualizacion(client);
		return "redirect:/listaCliente";
	}
}
