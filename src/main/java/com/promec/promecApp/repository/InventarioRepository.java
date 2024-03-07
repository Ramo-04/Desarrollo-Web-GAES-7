package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Inventario;
import com.promec.promecApp.entities.Servicio;

import java.util.List;

public interface InventarioRepository {


    public List<Inventario> findAll() throws Exception;

    public void create (Inventario inventario);

    public void delete (Inventario inventario);

    public void update (Inventario inventario);

}
