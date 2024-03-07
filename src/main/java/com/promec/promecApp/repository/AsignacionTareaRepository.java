package com.promec.promecApp.repository;

import com.promec.promecApp.entities.AsignacionTarea;
import com.promec.promecApp.entities.Cliente;

import java.util.List;

public interface AsignacionTareaRepository {

    public List<AsignacionTarea> findAll() throws Exception;

    public void create (AsignacionTarea asignacionTarea);


    public void delete (AsignacionTarea asignacionTarea);


    public void update (AsignacionTarea asignacionTarea);

}
