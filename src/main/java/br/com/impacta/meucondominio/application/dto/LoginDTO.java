package br.com.impacta.meucondominio.application.dto;

import jakarta.validation.constraints.Min;
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
public class LoginDTO implements Serializable {

    private static final long serialVersionUID = 8597514460649405502L;

    @NotNull(message = "{campo.login.senha.obrigatorio}")
    @NotBlank(message = "{campo.login.senha.obrigatorio}")
    @Min(message = "{campo.login.senha.tamanhominimo}", value = 6)
    private String senha;
}
