package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Rol;
import com.promec.promecApp.entities.Servicio;

import java.util.List;

public interface RolRepository {

    public List<Rol> findAll() throws Exception;

    public void create (Rol rol);


    public void delete (Rol rol);


    public void update (Rol rol);

}
