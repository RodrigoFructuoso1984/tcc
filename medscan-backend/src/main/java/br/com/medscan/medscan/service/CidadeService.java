package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.CidadeDTO;
import br.com.medscan.medscan.model.Cidade;
import br.com.medscan.medscan.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeDTO> findAll() {
        List<Cidade> result = cidadeRepository.findAll();
        return result.stream().map(x -> new CidadeDTO(x)).collect(Collectors.toList());
    }
}
