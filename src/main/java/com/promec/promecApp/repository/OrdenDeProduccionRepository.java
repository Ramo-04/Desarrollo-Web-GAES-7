package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Inventario;
import com.promec.promecApp.entities.OrdenDeProduccion;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrdenDeProduccionRepository {

    public List<OrdenDeProduccion> findAll() throws Exception;

    public void create (OrdenDeProduccion ordenDeProduccion);

    public void delete (OrdenDeProduccion ordenDeProduccion);

    public void update (OrdenDeProduccion ordenDeProduccion);

}
