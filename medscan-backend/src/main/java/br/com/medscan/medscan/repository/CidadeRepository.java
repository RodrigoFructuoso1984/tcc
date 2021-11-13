package br.com.medscan.medscan.repository;

import br.com.medscan.medscan.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
