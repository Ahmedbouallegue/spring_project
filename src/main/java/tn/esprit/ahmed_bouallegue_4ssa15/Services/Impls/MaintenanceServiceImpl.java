package tn.esprit.ahmed_bouallegue_4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmed_bouallegue_4ssa15.Repositories.IMaintenanceRepository;
import tn.esprit.ahmed_bouallegue_4ssa15.Services.IMaintenanceService;
import tn.esprit.ahmed_bouallegue_4ssa15.domain.Maintenance;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final IMaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance createMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance getMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }
}
