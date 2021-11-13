package br.com.medscan.medscan.controller;

import br.com.medscan.medscan.dto.ConvenioDTO;
import br.com.medscan.medscan.dto.ProfissionalDTO;
import br.com.medscan.medscan.service.ConvenioService;
import br.com.medscan.medscan.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/convenios")
public class ConvenioController {

    @Autowired
    private ConvenioService convenioService;

    @GetMapping
    public ResponseEntity<List<ConvenioDTO>> findAll() {
        List<ConvenioDTO> list = convenioService.findAll();
        return ResponseEntity.ok(list);
    }
}