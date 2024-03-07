package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Produccion;
import com.promec.promecApp.entities.Servicio;
import com.promec.promecApp.repository.ProduccionRepository;
import com.promec.promecApp.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduccionImp implements ProduccionRepository {


    @Autowired
    private ProduccionRepository produccionRepository;


    @Override
    public List<Produccion> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(Produccion produccion) {

    }

    @Override
    public void delete(Produccion produccion) {

    }

    @Override
    public void update(Produccion produccion) {

    }


}
