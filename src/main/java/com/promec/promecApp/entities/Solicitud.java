package com.promec.promecApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Solicitud")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Solicitud {

    @Id
    @Column(name = "id_solicitud")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "estado_activo")
    private String estado_activo;

    @Column(name = "estado_aprobado")
    private String estado_aprobado;

    @Column(name = "estado_no_aprobado")
    private String estado_no_aprobado;

    @Column(name = "estado_cancelado")
    private String estado_cancelado;
}
