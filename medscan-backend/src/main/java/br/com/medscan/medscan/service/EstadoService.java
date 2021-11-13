package br.com.medscan.medscan.service;

import br.com.medscan.medscan.dto.EstadoDTO;
import br.com.medscan.medscan.model.Estado;
import br.com.medscan.medscan.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<EstadoDTO> findAll() {
        List<Estado> result = estadoRepository.findAll();
        return result.stream().map(x -> new EstadoDTO(x)).collect(Collectors.toList());
    }
}
