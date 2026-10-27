package tn.esprit.ahmed_bouallegue_4ssa15.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmed_bouallegue_4ssa15.Repositories.IAgenceRepository;
import tn.esprit.ahmed_bouallegue_4ssa15.Services.IAgenceService;
import tn.esprit.ahmed_bouallegue_4ssa15.domain.Agence;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private final IAgenceRepository agenceRepository;

    @Override
    public Agence createAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence getAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }
}
