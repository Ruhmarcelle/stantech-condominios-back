package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;


import br.com.impacta.meucondominio.domain.exception.SolicitacaoNaoEncontradaException;
import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.domain.port.out.SolicitacaoRepository;
import br.com.impacta.meucondominio.infrastructure.adapter.repository.SolicitacaoMongoRepository;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;
import br.com.impacta.meucondominio.infrastructure.mapper.InfrastructureSolicitacaoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;

@Component
@RequiredArgsConstructor
public class SolicitacaoRepositoryImpl implements SolicitacaoRepository {

    private final SolicitacaoMongoRepository solicitacaoMongoRepository;
    private final InfrastructureSolicitacaoMapper infrastructureSolicitacaoMapper;

    private String mensagemSolicitacaoNaoEcontrada = "Solicitação %s não encontrada !";

    @Override
    public void salvar(Solicitacao solicitacao) {
        var solicitacaoEntity = infrastructureSolicitacaoMapper.solicitacaoToSolicitacaoEntity(solicitacao);
        solicitacaoMongoRepository.save(solicitacaoEntity);
    }

    @Override
    public Solicitacao consultar(String idSolicitacao) {

        var solicitacaoEntity = solicitacaoMongoRepository.findByIdSolicitacao(idSolicitacao);

        if (isNull(solicitacaoEntity))
            throw new SolicitacaoNaoEncontradaException(String.format(mensagemSolicitacaoNaoEcontrada, idSolicitacao));

        return infrastructureSolicitacaoMapper.solicitacaoEntityToSolicitacao(solicitacaoEntity);
    }

    @Override
    public List<Solicitacao> listar(String email) {

        var listaSolicitacao = solicitacaoMongoRepository.findByEmail(email);
        return infrastructureSolicitacaoMapper.listSolicitacaoEntityTolistSolicitacao(listaSolicitacao);
    }
}
