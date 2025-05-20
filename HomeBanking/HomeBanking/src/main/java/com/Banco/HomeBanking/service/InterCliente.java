package com.Banco.HomeBanking.service;

import java.util.ArrayList;
import java.util.List;

import com.Banco.HomeBanking.Entity.cliente;

public interface InterCliente {

    void guardar(cliente clie);
    List<cliente> obtenerLista();
    cliente buscarCliente(Integer iD);
    void eliminarCliente(Integer iD);
    void actualizacion(cliente client);
    
}
