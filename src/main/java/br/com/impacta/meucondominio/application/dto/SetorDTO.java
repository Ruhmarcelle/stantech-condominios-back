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
public class SetorDTO extends BaseDTO implements Serializable {
    private static final long serialVersionUID = -9037604577137912L;
}
