package br.com.impacta.meucondominio.infrastructure.mapper;

import br.com.impacta.meucondominio.domain.model.AreaComum;
import br.com.impacta.meucondominio.domain.model.Setor;
import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Unwrapped;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.apache.commons.lang3.StringUtils.EMPTY;

@Component
@NoArgsConstructor
public class InfrastructureSolicitacaoMapper {

     public SolicitacaoEntity solicitacaoToSolicitacaoEntity(Solicitacao solicitacao){
        return SolicitacaoEntity.builder()
                .id(solicitacao.getId())
                .email(solicitacao.getEmail())
                .idSolicitacao(solicitacao.getIdSolicitacao())
                .assunto(solicitacao.getAssunto())
                .setor(solicitacao.getSetor().getId())
                .areaComum(solicitacao.getAreaComum().getId())
                .descricao(solicitacao.getDescricao())
                .dataSolicitacao(solicitacao.getDataSolicitacao())
                .statusSolicitacao(solicitacao.getStatusSolicitacao())
                .build();
    }

    public Solicitacao solicitacaoEntityToSolicitacao(SolicitacaoEntity solicitacaoEntity){
         return Solicitacao.builder()
                 .email(solicitacaoEntity.getEmail())
                 .idSolicitacao(solicitacaoEntity.getIdSolicitacao())
                 .assunto(solicitacaoEntity.getAssunto())
                 .setor(Setor.builder()
                         .id(solicitacaoEntity.getSetor())
                         .nome(EMPTY)
                         .build())
                 .areaComum(AreaComum.builder()
                         .id(solicitacaoEntity.getAreaComum())
                         .nome(EMPTY)
                         .build())
                 .descricao(solicitacaoEntity.getDescricao())
                 .dataSolicitacao(solicitacaoEntity.getDataSolicitacao())
                 .statusSolicitacao(solicitacaoEntity.getStatusSolicitacao())
                 .build();
    }
    public List<Solicitacao> listSolicitacaoEntityTolistSolicitacao(List<SolicitacaoEntity> listSolicitacaoEntity) {
        return listSolicitacaoEntity.stream().map(solicitacaoEntity -> {
            return solicitacaoEntityToSolicitacao(solicitacaoEntity);
        }).collect(Collectors.toList());
    }
}
