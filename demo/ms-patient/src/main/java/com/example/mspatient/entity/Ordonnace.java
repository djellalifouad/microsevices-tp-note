package com.example.mspatient.entity;

import com.example.mspatient.models.Ordonnace2;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ordonnace {
    @Id
    @GeneratedValue
    private Long idOrdonnace;
    @ManyToOne
    @JoinColumn(name = "idPatient")
    @JsonIgnore
    private Patient patient;
    @Transient
    private Ordonnace2 ordonnace2;
}
