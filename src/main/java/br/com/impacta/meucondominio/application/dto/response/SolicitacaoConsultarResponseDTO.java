package br.com.impacta.meucondominio.application.dto.response;

import br.com.impacta.meucondominio.domain.enums.StatusEnum;
import br.com.impacta.meucondominio.domain.model.AreaComum;
import br.com.impacta.meucondominio.domain.model.Setor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SolicitacaoConsultarResponseDTO implements Serializable {

    private static final long serialVersionUID = 3888672011533331251L;
    private String idSolicitacao;
    private String assunto;
    private Setor setor;
    private AreaComum areaComum;
    private String descricao;
    private LocalDateTime dataSolicitacao;
    private String statusSolicitacao;
}
