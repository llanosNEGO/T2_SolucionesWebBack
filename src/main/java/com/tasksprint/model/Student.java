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
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    public Integer idStudent;

    @Column(nullable = false, length = 10, unique = true)
    public String code;

    @Column(nullable = false, length = 50, unique = true)
    public String motherLastname;

    public String fatherLastname;

    @Column(nullable = false, length = 50, unique = true)
    public String firstName;

    public String secondName;
}
