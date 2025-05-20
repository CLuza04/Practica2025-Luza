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
   	public void actualizacion(cliente clientActualizado) {
   		for (int i = 0; i < listaCliente.size(); i++) {
   			if (listaCliente.get(i).getID().equals(clientActualizado.getID())) {
   				listaCliente.set(i, clientActualizado);
   				break;
   			}
   		}
   	}
	@Override
	public cliente buscarCliente(Integer iD) {
	  for (cliente id : listaCliente) {
		if (id.getID() == iD) {
		 return id;
		}
	  }
	return null;	
	}

	@Override
	public void eliminarCliente(Integer iD) {
	  for (int i = 0; i < listaCliente.size(); i++) {
		if (listaCliente.get(i).getID() == iD) {
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
