package br.com.impacta.meucondominio.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@SuperBuilder(toBuilder = true)
public class SetorResponseDTO extends  BaseResponseDTO implements Serializable {
    private static final long serialVersionUID = -8008720080170813478L;
}
