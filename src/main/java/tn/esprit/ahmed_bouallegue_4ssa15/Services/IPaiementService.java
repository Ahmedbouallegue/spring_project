package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement paiement);

    Paiement getPaiementById(Long id);

    Paiement updatePaiement(Paiement paiement);

    void deletePaiement(Long id);

    List<Paiement> getAllPaiements();
}
