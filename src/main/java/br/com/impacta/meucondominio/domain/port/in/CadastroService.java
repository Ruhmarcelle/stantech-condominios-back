package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.Cadastro;

public interface CadastroService {

    public void salvar(Cadastro pessoa);
    public Cadastro consultar(String email);

}
