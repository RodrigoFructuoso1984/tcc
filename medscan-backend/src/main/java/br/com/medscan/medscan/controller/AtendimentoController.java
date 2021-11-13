package br.com.medscan.medscan.controller;

import br.com.medscan.medscan.dto.AtendimentoDTO;
import br.com.medscan.medscan.dto.ProfissionalDTO;
import br.com.medscan.medscan.service.AtendimentoService;
import br.com.medscan.medscan.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping
    public ResponseEntity<List<AtendimentoDTO>> findAll() {
        List<AtendimentoDTO> list = atendimentoService.findAll();
        return ResponseEntity.ok(list);
    }
}