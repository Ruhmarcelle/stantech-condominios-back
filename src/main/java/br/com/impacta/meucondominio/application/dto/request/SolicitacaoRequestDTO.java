package br.com.impacta.meucondominio.application.dto.request;

import br.com.impacta.meucondominio.application.dto.AreaComumDTO;
import br.com.impacta.meucondominio.application.dto.SetorDTO;
import br.com.impacta.meucondominio.domain.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.validation.Valid;
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

    @Valid
    @JsonProperty("setor")
    private SetorDTO setor;

    @Valid
    @JsonProperty("area_comum")
    private AreaComumDTO areaComum;

    @NotNull(message = "{campo.solicitacao.descricao}")
    @NotBlank(message = "{campo.solicitacao.descricao}")
    private String descricao;

    @JsonProperty("data_solicitacao")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDateTime dataSolicitacao;

    @JsonProperty("status_solicitacao")
    private StatusEnum statusSolicitacao;
}
