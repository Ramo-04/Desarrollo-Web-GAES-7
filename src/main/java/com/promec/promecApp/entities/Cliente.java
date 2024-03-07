package com.promec.promecApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "Clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "solicitud_servicio")
    private String solicitud_servicio;

    @Column(name = "modificacion_servicio")
    private String modificacion_servicio;

    @Column(name = "nombre_completo_cliente")
    private String nombre_completo_cliente;

    @OneToMany(mappedBy = "cliente")
    private List<Usuario> usuario;

    @OneToMany(mappedBy = "cliente")
    private List<Rol> rol;

}
