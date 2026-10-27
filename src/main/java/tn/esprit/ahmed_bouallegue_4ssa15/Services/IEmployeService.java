package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe createEmploye(Employe employe);

    Employe getEmployeById(Long id);

    Employe updateEmploye(Employe employe);

    void deleteEmploye(Long id);

    List<Employe> getAllEmployes();
}
