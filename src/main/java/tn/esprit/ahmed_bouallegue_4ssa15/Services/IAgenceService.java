package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence createAgence(Agence agence);

    Agence getAgenceById(Long id);

    Agence updateAgence(Agence agence);

    void deleteAgence(Long id);

    List<Agence> getAllAgences();
}
