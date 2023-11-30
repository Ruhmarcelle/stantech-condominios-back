package br.com.impacta.meucondominio.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder(toBuilder = true)
public class AreaComumResponseDTO extends BaseResponseDTO implements Serializable {
    private static final long serialVersionUID = 215598761990127293L;
}
