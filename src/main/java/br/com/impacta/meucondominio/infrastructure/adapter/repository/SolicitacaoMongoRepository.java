package br.com.impacta.meucondominio.infrastructure.adapter.repository;

import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoMongoRepository extends MongoRepository<SolicitacaoEntity, String> {

    SolicitacaoEntity findByIdSolicitacao(String idSolicitacao);
}
