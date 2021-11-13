package br.com.medscan.medscan.controller;

import br.com.medscan.medscan.dto.EstadoDTO;
import br.com.medscan.medscan.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public ResponseEntity<List<EstadoDTO>> findAll() {
        List<EstadoDTO> list = estadoService.findAll();
        return ResponseEntity.ok(list);
    }
}