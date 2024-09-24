package com.example.botscrewtask.entity;

import com.example.botscrewtask.enums.Degree;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Degree degree;

    private BigDecimal salary;

    @ManyToMany(mappedBy = "lectors", fetch = FetchType.EAGER)
    private Set<Department> departments;
}
