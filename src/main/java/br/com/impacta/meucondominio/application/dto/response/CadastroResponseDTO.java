package br.com.impacta.meucondominio.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Builder
public class CadastroResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String mensagem;
}
