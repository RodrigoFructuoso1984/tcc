package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.AtendimentoDTO;
import br.com.medscan.medscan.model.Atendimento;
import br.com.medscan.medscan.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    public List<AtendimentoDTO> findAll() {
        List<Atendimento> result = atendimentoRepository.findAll();
        return result.stream().map(x -> new AtendimentoDTO(x)).collect(Collectors.toList());
    }
}
