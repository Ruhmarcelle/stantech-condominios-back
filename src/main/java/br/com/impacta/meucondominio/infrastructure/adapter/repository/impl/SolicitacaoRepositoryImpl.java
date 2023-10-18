package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;


import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.domain.port.out.SolicitacaoRepository;
import br.com.impacta.meucondominio.infrastructure.adapter.repository.SolicitacaoMongoRepository;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;
import br.com.impacta.meucondominio.infrastructure.mapper.InfrastructureSolicitacaoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SolicitacaoRepositoryImpl implements SolicitacaoRepository {

    private final SolicitacaoMongoRepository solicitacaoMongoRepository;
    private final InfrastructureSolicitacaoMapper infrastructureSolicitacaoMapper;

    @Override
    public void salvar(Solicitacao solicitacao) {
        var solicitacaoEntity = infrastructureSolicitacaoMapper.solicitacaoToSolicitacaoEntity(solicitacao);
        solicitacaoMongoRepository.save(solicitacaoEntity);
    }

    @Override
    public Solicitacao consultar(String idSolicitacao) {

        var optSolicitacaoEntity = solicitacaoMongoRepository.findByIdSolicitacao(idSolicitacao);
        return infrastructureSolicitacaoMapper.solicitacaoEntityToSolicitacao(optSolicitacaoEntity);
    }
}
