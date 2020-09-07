package br.com.omni.leonardochallenge.controller;

import br.com.omni.leonardochallenge.repository.DepartamentoRepository;
import br.com.omni.leonardochallenge.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")
public class DepartamentoController {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    /*
    * Métodos de busca, inserção, atualização e exclusão
    * */
}
