package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Solicitud;

import java.util.List;

public interface SolicitudRepository {

    public List<Solicitud> findAll() throws Exception;

    public void create (Solicitud solicitud);

    public void delete (Solicitud solicitud);

    public void update (Solicitud solicitud);
}
