package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Produccion;
import com.promec.promecApp.entities.Servicio;

import java.util.List;

public interface ProduccionRepository {

    public List<Produccion> findAll() throws Exception;

    public void create (Produccion produccion);

    public void delete (Produccion produccion);

    public void update (Produccion produccion);
}
