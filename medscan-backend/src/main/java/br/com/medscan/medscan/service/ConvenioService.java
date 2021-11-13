package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.ConvenioDTO;
import br.com.medscan.medscan.dto.ProfissionalDTO;
import br.com.medscan.medscan.model.Convenio;
import br.com.medscan.medscan.model.Profissional;
import br.com.medscan.medscan.repository.ConvenioRepository;
import br.com.medscan.medscan.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConvenioService {

    @Autowired
    private ConvenioRepository convenioRepository;

    public List<ConvenioDTO> findAll() {
        List<Convenio> result = convenioRepository.findAll();
        return result.stream().map(x -> new ConvenioDTO(x)).collect(Collectors.toList());
    }
}
