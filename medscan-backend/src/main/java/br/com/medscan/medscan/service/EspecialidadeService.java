package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.EspecialidadeDTO;
import br.com.medscan.medscan.model.Especialidade;
import br.com.medscan.medscan.repository.EspecialidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EspecialidadeService {

    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    public List<EspecialidadeDTO> findAll() {
        List<Especialidade> result = especialidadeRepository.findAll();
        return result.stream().map(x -> new EspecialidadeDTO(x)).collect(Collectors.toList());
    }   
}
