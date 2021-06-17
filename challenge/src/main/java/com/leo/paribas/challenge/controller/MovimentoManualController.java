package com.leo.paribas.challenge.controller;

import com.leo.paribas.challenge.model.MovimentoManual;
import com.leo.paribas.challenge.service.MovimentoManualService;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paribas")
public class MovimentoManualController {

    @Autowired
    MovimentoManualService movimentoManualService;

    @GetMapping("/movimento")
    public Iterable<MovimentoManual> todosMovimentos(){

        return movimentoManualService.getMovimentoTodos();

    }

    @PostMapping("/salvar")
    public Long createTransaction(@RequestBody MovimentoManual movimentoManual) {
        movimentoManualService.salvarMovimentoManual(movimentoManual);
        return movimentoManual.getNumLancamento();
    }
}
