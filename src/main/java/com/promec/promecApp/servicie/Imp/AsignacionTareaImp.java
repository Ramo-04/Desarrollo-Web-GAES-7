package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.AsignacionTarea;
import com.promec.promecApp.entities.Cliente;
import com.promec.promecApp.repository.AsignacionTareaRepository;
import com.promec.promecApp.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AsignacionTareaImp implements AsignacionTareaRepository{

    @Autowired
    private AsignacionTareaRepository asignacionTareaRepository;

    @Override
    public List<AsignacionTarea> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(AsignacionTarea asignacionTarea) {
    }

    @Override
    public void delete(AsignacionTarea asignacionTarea) {

    }

    @Override
    public void update(AsignacionTarea asignacionTarea) {

    }
}
