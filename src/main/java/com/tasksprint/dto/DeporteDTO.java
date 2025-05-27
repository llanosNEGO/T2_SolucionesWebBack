package com.tasksprint.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeporteDTO {
    private  Integer id_deporte;
    private String nombre;
    private String tipo;
    private Integer numeroJugadores;
    private String equipoFamoso;
}
