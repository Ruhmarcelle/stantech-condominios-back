package br.com.impacta.meucondominio.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Login {
    private Long id;
    private String email;
    private String senha;
    private String mensagem;
}
