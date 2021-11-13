package br.com.medscan.medscan.controller;

import br.com.medscan.medscan.dto.CidadeDTO;
import br.com.medscan.medscan.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public ResponseEntity<List<CidadeDTO>> findAll() {
        List<CidadeDTO> list = cidadeService.findAll();
        return ResponseEntity.ok(list);
    }
}