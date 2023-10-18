package br.com.impacta.meucondominio.application.mapper;

import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.SolicitacaoResponseDTO;
import br.com.impacta.meucondominio.domain.model.Solicitacao;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ApplicationSolicitacaoMapper {

    public Solicitacao solicitacaoRequestDTOToSolicitacao(SolicitacaoRequestDTO solicitacaoRequestDTO){
        return Solicitacao.builder()
                .email(solicitacaoRequestDTO.getEmail())
                .assunto(solicitacaoRequestDTO.getAssunto())
                .setor(solicitacaoRequestDTO.getSetor())
                .areaComum(solicitacaoRequestDTO.getAreaComum())
                .descricao(solicitacaoRequestDTO.getDescricao())
                .dataSolicitacao(solicitacaoRequestDTO.getDataSolicitacao())
                .build();
    }

    public SolicitacaoResponseDTO solicitacaoToSolicitacaoResponseDTO(Solicitacao solicitacao){
        return SolicitacaoResponseDTO.builder()
                .mensagem(solicitacao.getMenssagem())
                .build();
    }
}
