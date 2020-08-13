package br.com.agr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutividadeTalhaoRepository extends MongoRepository {
}

//MongoRepository define metodos para todos operações CRUD como finAll(), fineOne(), save(), delete()
//Spring Boot automaticamente pluga uma implementação da interface MongoRepository chamada SimpleMongoRepository
/*em tempo de execução, assim os métodos CRUD definidos pelo MongoRepository
* já estarão disponíveis sem a necessidade de implementar algo mais*/
