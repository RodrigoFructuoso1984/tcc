package br.com.medscan.medscan.repository;

import br.com.medscan.medscan.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfissionalRepository extends JpaRepository<Profissional, Integer> {
    @Query("SELECT p FROM Profissional p WHERE p.nome LIKE '%?1%'")
    List<Profissional> findProfissionalByNome(String nome);
}
