package tn.esprit.ahmed_bouallegue_4ssa15.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPaiement;
    private BigDecimal montant;
    private LocalDate datePaiement;
    private ModePaiement modePaiement;

    @ManyToOne
    private Contrat contrat;
}
