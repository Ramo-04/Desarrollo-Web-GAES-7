package com.promec.promecApp;

import com.promec.promecApp.entities.Inventario;
import com.promec.promecApp.entities.Produccion;

import java.util.List;

public interface ProduccionService {

    public List<Produccion> findAll() throws Exception;

    public void create(Produccion produccion);


    public void delete(Produccion produccion);


    public void update(Produccion produccion);


}
