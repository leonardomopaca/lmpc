package br.com.agr.repository;

import br.com.agr.model.ProdutividadeTalhao;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProdutividadeTalhaoRepository extends MongoRepository<ProdutividadeTalhao, String> {
    //retorna produtividade por nomeProduto
    List<ProdutividadeTalhao> encontrarPorNomeProduto(String nomeProduto);
    //retorna os produtos que estão disponíveis para comercialização
    List<ProdutividadeTalhao> encontraPorDisponibilidade(Boolean disponivel);
}

/* Posso usar os métodos save(), findOne(), findById(), findAll(),
count(), delete(), deleteById() do MongoRepository
*/