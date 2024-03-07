package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Cliente;
import com.promec.promecApp.entities.Servicio;

import java.util.List;

public interface ClienteRepository {

        public List<Cliente> findAll() throws Exception;

        public void create (Cliente cliente);

        public void delete (Cliente cliente);

        public void update (Cliente cliente);
}
