package br.com.impacta.meucondominio.application.dto.request;

import jakarta.validation.constraints.Email;
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
public class LoginRequestDTO implements Serializable {

    private static final long serialVersionUID = -7582183703130850921L;

    @NotNull(message = "{campo.email.obrigatorio}")
    @NotBlank(message = "{campo.email.obrigatorio}")
    @Email
    private String email;

    @NotNull(message = "{campo.login.senha.obrigatorio}")
    @NotBlank(message = "{campo.login.senha.obrigatorio}")
    @Min(message = "{campo.login.senha.tamanhominimo}", value = 6)
    private String senha;
}
