package tn.esprit.ahmed_bouallegue_4ssa15.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipement;
    private String libelle;

    @ManyToOne
    private Vehicule vehicule;
}
