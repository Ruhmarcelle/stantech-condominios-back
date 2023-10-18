package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.Login;

public interface LoginRepository {

    public void salvar(Login login);
    public Login consultar(String email);
}
