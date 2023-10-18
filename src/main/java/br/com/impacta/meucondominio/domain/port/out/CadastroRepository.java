package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.Cadastro;

public interface CadastroRepository {

    public void salvar(Cadastro pessoa);
    public Cadastro consultar(String email);
}
