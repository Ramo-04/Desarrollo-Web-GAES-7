package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Empleado;
import com.promec.promecApp.entities.Inventario;

import java.util.List;

public interface EmpleadoRepository {

    public List<Empleado> findAll() throws Exception;

    public void create (Empleado empleado);


    public void delete (Empleado empleado);


    public void update (Empleado empleado);


}
