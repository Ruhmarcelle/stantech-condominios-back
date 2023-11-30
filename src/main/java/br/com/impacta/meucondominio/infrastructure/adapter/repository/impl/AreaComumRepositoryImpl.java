package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;


import br.com.impacta.meucondominio.domain.enums.AreaComumEnum;
import br.com.impacta.meucondominio.domain.exception.SolicitacaoNaoEncontradaException;
import br.com.impacta.meucondominio.domain.model.AreaComum;
import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.domain.port.out.AreaComumRepository;
import br.com.impacta.meucondominio.infrastructure.adapter.repository.SolicitacaoMongoRepository;
import br.com.impacta.meucondominio.infrastructure.mapper.InfrastructureSolicitacaoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.awt.geom.Area;
import java.util.List;

import static java.util.Objects.isNull;

@Component
public class AreaComumRepositoryImpl implements AreaComumRepository {

    @Override
    public List<AreaComum> consultar() {
        return AreaComumEnum.getAreaComum();
    }
}
