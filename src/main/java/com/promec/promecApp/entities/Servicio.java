package com.promec.promecApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Servicio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servicio {

    @Id
    @Column(name = "id_servicio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_servicio")
    private String nombreServicio;

    @Column(name = "descripcion_servicio")
    private String descripcionServicio;

    @Column(name = "calidad_servicio")
    private String calidadServicio;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
}
