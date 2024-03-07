package com.promec.promecApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "contraseña")
    private String contrasena;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
