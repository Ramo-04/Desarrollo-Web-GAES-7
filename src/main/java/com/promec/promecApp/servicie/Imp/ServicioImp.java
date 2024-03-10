package com.promec.promecApp.servicie.Imp;

import com.promec.promecApp.entities.Servicio;
import com.promec.promecApp.entities.Solicitud;
import com.promec.promecApp.repository.ServicioRepository;
import com.promec.promecApp.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicioImp implements ServicioRepository {


        @Autowired
        private ServicioRepository servicioRepository;

        @Override
        public List<Servicio> findAll() throws Exception {
            return null;
        }

        @Override
        public void create(Servicio servicio) {

        }

        @Override
        public void delete(Servicio servicio) {

        }

        @Override
        public void update(Servicio servicio) {

        }

}
