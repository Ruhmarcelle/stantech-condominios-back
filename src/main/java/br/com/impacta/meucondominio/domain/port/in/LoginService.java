package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.Login;

public interface LoginService {

    public Login salvar(Login login);

    public Login validar(Login login);
}
