package br.com.impacta.meucondominio.application.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class SolicitacaoRequestDTO implements Serializable {

    private static final long serialVersionUID = 7611685635507887006L;

    @NotNull(message = "{campo.email.obrigatorio}")
    @NotBlank(message = "{campo.email.obrigatorio}")
    @Email
    private String email;

    @NotNull(message = "{campo.solicitacao.assunto}")
    @NotBlank(message = "{campo.solicitacao.assunto}")
    private String assunto;

    @NotNull(message = "{campo.solicitacao.setor}")
    @NotBlank(message = "{campo.solicitacao.setor}")
    private String setor;

    @JsonProperty("area_comum")
    @NotNull(message = "{campo.solicitacao.areacomum}")
    @NotBlank(message = "{campo.solicitacao.areacomum}")
    private String areaComum;

    @NotNull(message = "{campo.solicitacao.descricao}")
    @NotBlank(message = "{campo.solicitacao.descricao}")
    private String descricao;

    @JsonProperty("data_solicitacao")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDateTime dataSolicitacao;
}
