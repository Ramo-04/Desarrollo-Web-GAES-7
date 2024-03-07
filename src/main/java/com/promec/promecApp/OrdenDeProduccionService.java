package com.promec.promecApp;

import com.promec.promecApp.entities.Inventario;
import com.promec.promecApp.entities.OrdenDeProduccion;

import java.util.List;

public interface OrdenDeProduccionService {

    public List<OrdenDeProduccion> findAll() throws Exception;


    public void create(OrdenDeProduccion ordenDeProduccion);


    public void delete(OrdenDeProduccion ordenDeProduccion);


    public void update(OrdenDeProduccion ordenDeProduccion);

}
