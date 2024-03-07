package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Empleado;
import com.promec.promecApp.entities.Inventario;
import com.promec.promecApp.repository.EmpleadoRepository;
import com.promec.promecApp.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpleadoImp implements EmpleadoRepository{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(Empleado empleado) {

    }

    @Override
    public void delete(Empleado empleado) {

    }

    @Override
    public void update(Empleado empleado) {
    }
}
