package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.ProfissionalDTO;
import br.com.medscan.medscan.dto.ProfissionalFilter;
import br.com.medscan.medscan.model.Profissional;
import br.com.medscan.medscan.repository.AtendimentoRepository;
import br.com.medscan.medscan.repository.ConvenioRepository;
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
    @Autowired
    private AtendimentoRepository atendimentoRepository;
    @Autowired
    private ConvenioRepository convenioRepository;
    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    public List<ProfissionalDTO> findAll() {
        List<Profissional> result = profissionalRepository.findAll();
        return result.stream().map(ProfissionalDTO::new).collect(Collectors.toList());
    }
}
