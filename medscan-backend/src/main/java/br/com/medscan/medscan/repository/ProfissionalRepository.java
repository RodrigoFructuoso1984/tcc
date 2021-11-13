package br.com.medscan.medscan.repository;

import br.com.medscan.medscan.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Profissional, Integer> {
}
