package com.leo.paribas.challenge.service;

import com.leo.paribas.challenge.model.MovimentoManual;
import com.leo.paribas.challenge.repository.MovimentoManualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovimentoManualService {

    @Autowired
    MovimentoManualRepository movimentoManualRepository;

    public void salvarMovimentoManual(MovimentoManual movimentoManual){
        movimentoManualRepository.save(movimentoManual);
    }

    public Iterable<MovimentoManual> getMovimentoTodos(){
        return movimentoManualRepository.findAll();
    }

}
