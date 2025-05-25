package com.tasksprint.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassromDTO {
    private Integer idClassroom;

    @NotNull(message = "El NRC es obligatorio")
    @Positive(message = "El NRC ingresado tiene que ser numero entero")
    private Integer NRC;

    @NotNull(message = "El Codigo de Curso debe ser ingresado")
    private Integer idCourse;

    @NotNull(message = "El Codigo de Cocente debe ser ingresado")
    private Integer idTeacher;

    @NotNull(message = "El Codigo de Carrera debe ser ingresado")
    private Integer idCareer;

    @NotBlank(message = "Semestre debe ser ingresado")
    @Size(min = 5, message = "El semestre ingrsado no cumplecon los paramtros de longitud (5min.)")
    private String semester;

    @NotNull(message = "El nivel debe ser ingresado")
    @Min(value = 1, message = "Nivel minimo 1")
    @Max(value = 10, message = "Nivel máximo 10")
    private Integer level;

    @NotNull(message = "Estado debe ser ingresado")
    private Boolean status;
}
