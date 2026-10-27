package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat createContrat(Contrat contrat);

    Contrat getContratById(Long id);

    Contrat updateContrat(Contrat contrat);

    void deleteContrat(Long id);

    List<Contrat> getAllContrats();
}
