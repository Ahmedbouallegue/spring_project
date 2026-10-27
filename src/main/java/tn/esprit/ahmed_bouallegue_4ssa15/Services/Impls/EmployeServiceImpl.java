package tn.esprit.ahmed_bouallegue_4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmed_bouallegue_4ssa15.Repositories.IEmployeRepository;
import tn.esprit.ahmed_bouallegue_4ssa15.Services.IEmployeService;
import tn.esprit.ahmed_bouallegue_4ssa15.domain.Employe;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    private final IEmployeRepository employeRepository;

    @Override
    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }
}
