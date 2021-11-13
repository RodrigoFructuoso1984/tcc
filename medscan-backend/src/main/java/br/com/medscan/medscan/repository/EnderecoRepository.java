package br.com.medscan.medscan.repository;

import br.com.medscan.medscan.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
