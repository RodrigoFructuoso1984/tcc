package br.com.medscan.medscan.repository;

import br.com.medscan.medscan.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfissionalRepository extends JpaRepository<Profissional, Integer> {
    List<Profissional> findByFilter();
}
