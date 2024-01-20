package com.example.propuestaCultura.models;

import jakarta.persistence.*;

import java.util.UUID;
// cojer las entidades y le voy a poner anotacion a cada tabla y va a identificar llave primeriar caomo llave primaria
@Entity
@Table(name = "proponentes")
public class Proponente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "nombres", length = 50, nullable = false)
    private String nombre_proponente;
    private String trayectoria_proponente;
    private Integer id_representante;
    private Integer id_tipo_proponente;
}
