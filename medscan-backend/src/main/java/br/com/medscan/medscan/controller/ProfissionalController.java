package br.com.medscan.medscan.controller;

import br.com.medscan.medscan.dto.ProfissionalDTO;
import br.com.medscan.medscan.dto.ProfissionalFilter;
import br.com.medscan.medscan.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {

    @Autowired
    private ProfissionalService profissionalService;

    @GetMapping
    public ResponseEntity<List<ProfissionalDTO>> findAll() {
        List<ProfissionalDTO> list = profissionalService.findAll();
        return ResponseEntity.ok(list);
    }
}