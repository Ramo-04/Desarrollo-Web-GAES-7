package com.promec.promecApp;

import com.promec.promecApp.entities.Solicitud;
import com.promec.promecApp.entities.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> findAll() throws Exception;
    public void create(Usuario usuario);

    public void delete(Usuario usuario);

    public void update(Usuario usuario);

}
