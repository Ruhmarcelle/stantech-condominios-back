package br.com.impacta.meucondominio.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Cadastro {

    private String email;
    private String nome;
    private String cpf;
    private String contato;
    private LocalDateTime dataCadastro;
    private Unidade unidade;
    private Login login;
    private List<Solicitacao> solicitacoes;
}
