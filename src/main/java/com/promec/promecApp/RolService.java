package com.promec.promecApp;

import com.promec.promecApp.entities.Cliente;
import com.promec.promecApp.entities.Rol;

import java.util.List;

public interface RolService {

    public List<Rol> findAll() throws Exception;
    public void create(Rol rol);

    public void delete(Rol rol);

    public void update(Rol rol);
}
