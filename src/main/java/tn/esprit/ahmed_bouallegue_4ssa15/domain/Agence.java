package tn.esprit.ahmed_bouallegue_4ssa15.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;
    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}
