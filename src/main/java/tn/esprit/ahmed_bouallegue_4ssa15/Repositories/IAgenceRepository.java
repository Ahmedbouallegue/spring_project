package tn.esprit.ahmed_bouallegue_4ssa15.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ahmed_bouallegue_4ssa15.domain.Agence;

@Repository
public interface IAgenceRepository extends JpaRepository<Agence, Long> {
}
