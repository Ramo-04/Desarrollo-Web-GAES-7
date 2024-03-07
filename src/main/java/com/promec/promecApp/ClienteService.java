package com.promec.promecApp;

import com.promec.promecApp.entities.Cliente;
import com.promec.promecApp.entities.Servicio;

import java.util.List;

public interface ClienteService {

    public List<Cliente> findAll() throws Exception;
    public void create(Cliente cliente);
    public void delete(Cliente cliente);
    public void update(Cliente cliente);

}
