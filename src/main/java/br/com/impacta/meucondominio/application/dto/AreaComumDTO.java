package br.com.impacta.meucondominio.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@NoArgsConstructor
@Data
@SuperBuilder(toBuilder = true)
public class AreaComumDTO extends BaseDTO implements Serializable {
    private static final long serialVersionUID = -1359244505421260055L;
}
