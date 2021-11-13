package br.com.medscan.medscan.repository;

import br.com.medscan.medscan.model.Atendimento;
import br.com.medscan.medscan.model.Convenio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {
}
