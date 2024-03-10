package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Rol;
import com.promec.promecApp.entities.Servicio;
import com.promec.promecApp.repository.RolRepository;
import com.promec.promecApp.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RolImp implements RolRepository {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Rol> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(Rol rol) {

    }

    @Override
    public void delete(Rol rol) {

    }

    @Override
    public void update(Rol rol) {

    }
}
