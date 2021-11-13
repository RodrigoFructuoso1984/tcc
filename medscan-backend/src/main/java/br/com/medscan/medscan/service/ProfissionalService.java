package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.EspecialidadeDTO;
import br.com.medscan.medscan.dto.ProfissionalDTO;
import br.com.medscan.medscan.model.Especialidade;
import br.com.medscan.medscan.model.Profissional;
import br.com.medscan.medscan.repository.EspecialidadeRepository;
import br.com.medscan.medscan.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfissionalService {

    @Autowired
    private ProfissionalRepository profissionalRepository;

    public List<ProfissionalDTO> findAll() {
        List<Profissional> result = profissionalRepository.findAll();
        return result.stream().map(x -> new ProfissionalDTO(x)).collect(Collectors.toList());
    }
}
