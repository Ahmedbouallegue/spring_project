package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement createEquipement(Equipement equipement);

    Equipement getEquipementById(Long id);

    Equipement updateEquipement(Equipement equipement);

    void deleteEquipement(Long id);

    List<Equipement> getAllEquipements();
}
