package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Servicio;
import com.promec.promecApp.entities.Solicitud;

import java.util.List;

public interface ServicioRepository {

    public List<Servicio> findAll() throws Exception;

    public void create (Servicio servicio);

    public void delete (Servicio servicio);

    public void update (Servicio servicio);
}

