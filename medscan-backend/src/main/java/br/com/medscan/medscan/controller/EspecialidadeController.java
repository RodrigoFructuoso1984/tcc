package br.com.medscan.medscan.controller;

import br.com.medscan.medscan.dto.EspecialidadeDTO;
import br.com.medscan.medscan.service.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeController {

    @Autowired
    private EspecialidadeService especialidadeService;

    @GetMapping
    public ResponseEntity<List<EspecialidadeDTO>> findAll() {
        List<EspecialidadeDTO> list = especialidadeService.findAll();
        return ResponseEntity.ok(list);
    }
}