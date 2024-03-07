package com.promec.promecApp;

import com.promec.promecApp.entities.Solicitud;

import java.util.List;

public interface SolicitudService {

    public List<Solicitud> findAll() throws Exception;
    public void create(Solicitud solicitud);
    public void delete(Solicitud solicitud);
    public void update(Solicitud solicitud);

}
