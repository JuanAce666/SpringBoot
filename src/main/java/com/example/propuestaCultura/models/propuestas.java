package com.example.propuestaCultura.models;

import com.example.propuestaCultura.models.helpers.EstadosPropuestas;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Date;
import java.util.UUID;

public class propuestas {
    private UUID id;
    private String descripcion_actividades;
    private String descripcion_propuesta;
    private String empresas_aliadas;
    private String estado_propuesta;
    private Date fecha_inicio_evento;
    private Date fecha_presentacion;
    private String nombre_propuesta;
    private String publico_beneficiado;
    private Integer id_proponente;
    private Integer valo_propuesta;
    private EstadosPropuestas estadosPropuestas = EstadosPropuestas.INICIO;
}
