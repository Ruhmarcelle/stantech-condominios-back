package br.com.impacta.meucondominio.domain.service.impl;

import br.com.impacta.meucondominio.domain.port.in.GeradorSequenceService;
import br.com.impacta.meucondominio.infrastructure.entity.SequenceEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
@RequiredArgsConstructor
public class GeradorSequenceServiceImpl implements GeradorSequenceService {

    private final MongoOperations mongoOperations;

    @Override
    public long gerarSequence(String nomeSequence) {
        SequenceEntity counter = mongoOperations.findAndModify(query(where("_id").is(nomeSequence)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                SequenceEntity.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 1;
    }
}
