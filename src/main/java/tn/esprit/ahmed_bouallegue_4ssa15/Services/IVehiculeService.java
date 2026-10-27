package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);

    Vehicule getVehiculeById(Long id);

    Vehicule updateVehicule(Vehicule vehicule);

    void deleteVehicule(Long id);

    List<Vehicule> getAllVehicules();
}
