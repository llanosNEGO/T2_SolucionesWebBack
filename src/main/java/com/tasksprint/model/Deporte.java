package com.tasksprint.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Deporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id_deporte;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false, length = 20)
    private String tipo;
    @Column(nullable = false)
    private  int numeroJugadores;
    @Column(nullable = false, length = 60)
    private String equipoFamoso;

}
