package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Solicitud;
import com.promec.promecApp.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SolicitudImp implements SolicitudRepository {

    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public List<Solicitud> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(Solicitud solicitud) {

    }

    @Override
    public void delete(Solicitud solicitud) {

    }

    @Override
    public void update(Solicitud solicitud) {

    }

}
