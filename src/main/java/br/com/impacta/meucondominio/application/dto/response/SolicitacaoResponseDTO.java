package br.com.impacta.meucondominio.application.dto.response;

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
public class SolicitacaoResponseDTO implements Serializable {

    private static final long serialVersionUID = -1873394009209879543L;
    private String idSolicitacao;
    private LocalDateTime dataSolicitacao;
    private String mensagem;
}
