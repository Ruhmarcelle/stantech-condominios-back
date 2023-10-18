package br.com.impacta.meucondominio.infrastructure.adapter.repository;

import br.com.impacta.meucondominio.infrastructure.entity.CadastroEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroMongoRepository extends MongoRepository<CadastroEntity, String> {}
