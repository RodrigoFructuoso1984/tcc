package br.com.medscan.medscan.controller;

import br.com.medscan.medscan.dto.EnderecoDTO;
import br.com.medscan.medscan.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<List<EnderecoDTO>> findAll() {
        List<EnderecoDTO> list = enderecoService.findAll();
        return ResponseEntity.ok(list);
    }
}