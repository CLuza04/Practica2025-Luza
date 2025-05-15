package com.Banco.HomeBanking.service;

import java.util.ArrayList;
import java.util.List;

import com.Banco.HomeBanking.Entity.cliente;

public interface InterCliente {

    void guardar(cliente clie);
    List<cliente> obtenerLista();
    void modificarCliente();
    cliente buscarCliente(int dni);
    void eliminarCliente(int dni);
    
}
