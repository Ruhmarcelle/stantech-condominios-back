package br.com.impacta.meucondominio.infrastructure.entity;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Unidade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Jacksonized
@Document(collection = "cadastro")
public class CadastroEntity {

    @Id
    private String email;
    @Indexed(unique = true)
    private String cpf;
    private String nome;
    private String contato;
    private LocalDateTime dataCadastro;
    private Unidade unidade;
}
