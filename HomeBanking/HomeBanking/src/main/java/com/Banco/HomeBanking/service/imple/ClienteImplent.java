package com.Banco.HomeBanking.service.imple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Banco.HomeBanking.Entity.cliente;
import com.Banco.HomeBanking.service.InterCliente;

@Service
public class ClienteImplent implements InterCliente {
	private List<cliente> listaCliente=new ArrayList<>();

	@Override
	public void guardar(cliente client) {
		listaCliente.add(client);		
	}
	
    @Override
	public void modificarCliente() {
		
	}

	@Override
	public cliente buscarCliente(int dni) {
	  for (cliente d : listaCliente) {
		if (d.getDni()==dni) {
		 return d;
		}
	  }
	return null;	
	}

	@Override
	public void eliminarCliente(int dni) {
	  for (int i = 0; i < listaCliente.size(); i++) {
		if (listaCliente.get(i).getDni()==dni) {
			listaCliente.remove(i);
			break;
		}
	}
	}

	@Override
	public List<cliente> obtenerLista() {
		return listaCliente;
	}

}
