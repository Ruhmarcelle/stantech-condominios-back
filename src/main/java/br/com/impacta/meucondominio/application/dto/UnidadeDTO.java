package br.com.impacta.meucondominio.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UnidadeDTO implements Serializable {

    private static final long serialVersionUID = -5645811586853150107L;

    @NotNull(message = "{campo.apartamento.obrigatorio}")
    @NotBlank(message = "{campo.apartamento.obrigatorio}")
    private String apartamento;
    private String bloco;
}
