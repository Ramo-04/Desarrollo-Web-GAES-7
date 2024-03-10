package com.promec.promecApp.repository;

import com.promec.promecApp.entities.Solicitud;
import com.promec.promecApp.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {


    public List<Usuario> findAll() throws Exception;

    public void create (Usuario usuario);


    public void delete (Usuario usuario);


    public void update (Usuario usuario);


}
