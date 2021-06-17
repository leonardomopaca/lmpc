package com.leo.paribas.challenge.repository;

import com.leo.paribas.challenge.model.MovimentoManual;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoManualRepository extends CrudRepository<MovimentoManual, Long> {

}
