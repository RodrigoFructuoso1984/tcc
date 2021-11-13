package br.com.medscan.medscan.controller;

import br.com.medscan.medscan.dto.LogradouroDTO;
import br.com.medscan.medscan.service.LogradouroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logradouros")
public class LogradouroController {

    @Autowired
    private LogradouroService logradouroService;

    @GetMapping
    public ResponseEntity<List<LogradouroDTO>> findAll() {
        List<LogradouroDTO> list = logradouroService.findAll();
        return ResponseEntity.ok(list);
    }
}