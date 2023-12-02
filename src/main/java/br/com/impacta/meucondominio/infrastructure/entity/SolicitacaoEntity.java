package br.com.impacta.meucondominio.infrastructure.entity;

import br.com.impacta.meucondominio.domain.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Jacksonized
@Document(collection = "solicitacao")
public class SolicitacaoEntity {

    @Transient
    public static final String SEQUENCE_NAME = "solicitacao_sequence";

    @Id
    private Long id;

    private String email;

    @Indexed(unique = true)
    private String idSolicitacao;

    private String assunto;
    private int setor;
    private int areaComum;
    private String descricao;

    private LocalDateTime dataSolicitacao;
    private StatusEnum statusSolicitacao;

}
