package br.com.impacta.meucondominio.infrastructure.mapper;

import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class InfrastructureSolicitacaoMapper {

     public SolicitacaoEntity solicitacaoToSolicitacaoEntity(Solicitacao solicitacao){
        return SolicitacaoEntity.builder()
                .email(solicitacao.getEmail())
                .idSolicitacao(solicitacao.getIdSolicitacao())
                .assunto(solicitacao.getAssunto())
                .setor(solicitacao.getSetor())
                .areaComum(solicitacao.getAreaComum())
                .descricao(solicitacao.getDescricao())
                .dataSolicitacao(solicitacao.getDataSolicitacao())
                .build();
    }

    public Solicitacao solicitacaoEntityToSolicitacao(SolicitacaoEntity solicitacaoEntity){
         return Solicitacao.builder()
                 .email(solicitacaoEntity.getEmail())
                 .idSolicitacao(solicitacaoEntity.getIdSolicitacao())
                 .assunto(solicitacaoEntity.getAssunto())
                 .setor(solicitacaoEntity.getSetor())
                 .areaComum(solicitacaoEntity.getAreaComum())
                 .descricao(solicitacaoEntity.getDescricao())
                 .dataSolicitacao(solicitacaoEntity.getDataSolicitacao())
                 .build();
    }
}
