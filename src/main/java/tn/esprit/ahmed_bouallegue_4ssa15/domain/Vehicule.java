package tn.esprit.ahmed_bouallegue_4ssa15.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVehicule;
    private String immatriculation;
    private String marque;
    private String model;
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    private statutVehicule statut;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "vehicule")
    private List<Maintenance> maintenances;

    @OneToMany(mappedBy = "vehicule")
    private List<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations;
}
