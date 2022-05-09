package com.example.msordonnace.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ordonnace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdonnace;
    private Date date ;
    private String text;
    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;
}
