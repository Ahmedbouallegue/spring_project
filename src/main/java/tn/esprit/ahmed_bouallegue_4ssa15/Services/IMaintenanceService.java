package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance createMaintenance(Maintenance maintenance);

    Maintenance getMaintenanceById(Long id);

    Maintenance updateMaintenance(Maintenance maintenance);

    void deleteMaintenance(Long id);

    List<Maintenance> getAllMaintenances();
}
