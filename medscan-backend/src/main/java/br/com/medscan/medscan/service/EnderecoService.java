package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.EnderecoDTO;
import br.com.medscan.medscan.model.Endereco;
import br.com.medscan.medscan.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<EnderecoDTO> findAll() {
        List<Endereco> result = enderecoRepository.findAll();
        return result.stream().map(x -> new EnderecoDTO(x)).collect(Collectors.toList());
    }   
}
