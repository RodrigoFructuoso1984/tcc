package br.com.medscan.medscan.repository;

import br.com.medscan.medscan.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Integer> {
}
