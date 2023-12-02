package br.com.impacta.meucondominio.domain.model;

import br.com.impacta.meucondominio.domain.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.awt.geom.Area;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@Builder
public class Solicitacao {
    private Long id;
    private String email;
    private String idSolicitacao;
    private String assunto;
    private Setor setor;
    private AreaComum areaComum;
    private String descricao;
    private LocalDateTime dataSolicitacao;
    private String menssagem;
    private StatusEnum statusSolicitacao;
}
