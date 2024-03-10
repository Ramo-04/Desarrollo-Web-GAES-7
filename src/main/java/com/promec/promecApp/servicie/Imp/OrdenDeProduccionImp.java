package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Inventario;
import com.promec.promecApp.entities.OrdenDeProduccion;
import com.promec.promecApp.repository.InventarioRepository;
import com.promec.promecApp.repository.OrdenDeProduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrdenDeProduccionImp implements OrdenDeProduccionRepository {


    @Autowired
    private OrdenDeProduccion ordenDeProduccion;

    @Override
    public List<OrdenDeProduccion> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(OrdenDeProduccion ordenDeProduccion) {

    }

    @Override
    public void delete(OrdenDeProduccion ordenDeProduccion) {

    }

    @Override
    public void update(OrdenDeProduccion ordenDeProduccion) {
    }
}
