package br.com.impacta.meucondominio.application.mapper;

import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.SolicitacaoConsultarResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.SolicitacaoResponseDTO;
import br.com.impacta.meucondominio.domain.enums.StatusEnum;
import br.com.impacta.meucondominio.domain.model.AreaComum;
import br.com.impacta.meucondominio.domain.model.Setor;
import br.com.impacta.meucondominio.domain.model.Solicitacao;
import jdk.jshell.Snippet;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
@NoArgsConstructor
public class ApplicationSolicitacaoMapper {

    public Solicitacao solicitacaoRequestDTOToSolicitacao(SolicitacaoRequestDTO solicitacaoRequestDTO){
        return Solicitacao.builder()
                .email(solicitacaoRequestDTO.getEmail())
                .assunto(solicitacaoRequestDTO.getAssunto())
                .setor(Setor.builder()
                        .id(solicitacaoRequestDTO.getSetor().getId())
                        .nome(solicitacaoRequestDTO.getSetor().getNome())
                        .build())
                .areaComum(AreaComum.builder()
                        .id(solicitacaoRequestDTO.getAreaComum().getId())
                        .nome(solicitacaoRequestDTO.getAreaComum().getNome())
                        .build())
                .descricao(solicitacaoRequestDTO.getDescricao())
                .dataSolicitacao(solicitacaoRequestDTO.getDataSolicitacao())
                .statusSolicitacao(StatusEnum.EM_ABERTO)
                .build();
    }

    public SolicitacaoResponseDTO solicitacaoToSolicitacaoResponseDTO(Solicitacao solicitacao){
        return SolicitacaoResponseDTO.builder()
                .idSolicitacao(solicitacao.getIdSolicitacao())
                .dataSolicitacao(solicitacao.getDataSolicitacao())
                .mensagem(solicitacao.getMenssagem())
                .build();
    }

    public SolicitacaoConsultarResponseDTO solicitacaoToSolicitacaoConsultarResponseDTO(Solicitacao solicitacao){
        return SolicitacaoConsultarResponseDTO.builder()
                .idSolicitacao(solicitacao.getIdSolicitacao())
                .setor(solicitacao.getSetor())
                .areaComum(solicitacao.getAreaComum())
                .assunto(solicitacao.getAssunto())
                .descricao(solicitacao.getDescricao())
                .dataSolicitacao(solicitacao.getDataSolicitacao())
                .statusSolicitacao(solicitacao.getStatusSolicitacao().getDescricao())
                .build();
    }

    public List<SolicitacaoConsultarResponseDTO> listSolicitacaoToListSolicitacaoConsultarResponseDTO(List<Solicitacao> listSolicitacao) {
        return listSolicitacao.stream().map(solicitacao -> {
            return solicitacaoToSolicitacaoConsultarResponseDTO(solicitacao);
        }).collect(Collectors.toList());
    }
}
