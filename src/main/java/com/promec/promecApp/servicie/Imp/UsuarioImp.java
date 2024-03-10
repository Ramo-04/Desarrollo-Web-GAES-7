package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Solicitud;
import com.promec.promecApp.entities.Usuario;
import com.promec.promecApp.repository.SolicitudRepository;
import com.promec.promecApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioImp implements UsuarioRepository {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() throws Exception {
        return null;
    }

    @Override
    public void create(Usuario usuario) {

    }

    @Override
    public void delete(Usuario usuario) {

    }

    @Override
    public void update(Usuario usuario) {

    }
}
