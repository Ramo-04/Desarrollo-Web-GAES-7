package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Cliente;
import com.promec.promecApp.repository.ClienteRepository;
import com.promec.promecApp.repository.SolicitudRepository;
import com.promec.promecApp.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteImp implements ClienteRepository {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(Cliente cliente) {

    }

    @Override
    public void delete(Cliente cliente) {

    }

    @Override
    public void update(Cliente cliente) {


    }
}
