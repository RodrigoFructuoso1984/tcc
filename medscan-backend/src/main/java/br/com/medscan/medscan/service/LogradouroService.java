package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.LogradouroDTO;
import br.com.medscan.medscan.model.Logradouro;
import br.com.medscan.medscan.repository.LogradouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LogradouroService {

    @Autowired
    private LogradouroRepository logradouroRepository;

    public List<LogradouroDTO> findAll() {
        List<Logradouro> result = logradouroRepository.findAll();
        return result.stream().map(x -> new LogradouroDTO(x)).collect(Collectors.toList());
    }   
}
