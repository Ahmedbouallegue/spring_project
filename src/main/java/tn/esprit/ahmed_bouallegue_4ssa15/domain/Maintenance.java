package tn.esprit.ahmed_bouallegue_4ssa15.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMaintenance;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;

    @ManyToOne
    private Vehicule vehicule;
}
