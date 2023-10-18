package br.com.impacta.meucondominio.application.dto.response;

import br.com.impacta.meucondominio.domain.model.Unidade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Builder
public class ConsultaResponseDTO implements Serializable {

    private String email;
    private String nome;
    private String cpf;
    private String contato;
    private Unidade unidade;
}
