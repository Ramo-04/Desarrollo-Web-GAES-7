package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Cliente;
import com.promec.promecApp.entities.Inventario;
import com.promec.promecApp.repository.InventarioRepository;
import com.promec.promecApp.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InventarioImp implements InventarioRepository {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Override
    public List<Inventario> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(Inventario inventario) {

    }

    @Override
    public void delete(Inventario inventario) {

    }

    @Override
    public void update(Inventario inventario) {
    }
}
