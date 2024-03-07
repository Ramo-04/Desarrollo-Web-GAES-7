package com.promec.promecApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "EMPLEADO") // Changed table name to uppercase and match database convention
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sueldo_bruto")
    private Double sueldo;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "nombre_completo_empleado")
    private String nombreCompleto;

    @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL)
    private List<AsignacionTarea> asignacionTarea;

    @OneToMany(mappedBy = "empleado")
    private List<Produccion> produccion;

    @OneToMany(mappedBy = "empleado")
    private List<Servicio> servicio;

    @OneToMany(mappedBy = "empleado")
    private List<Usuario> usuario;

    @OneToMany(mappedBy = "empleado")
    private List<Rol> rol;

}
