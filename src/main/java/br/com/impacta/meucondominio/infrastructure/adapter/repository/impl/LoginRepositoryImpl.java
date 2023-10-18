package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.port.out.CadastroRepository;
import br.com.impacta.meucondominio.domain.port.out.LoginRepository;
import br.com.impacta.meucondominio.infrastructure.adapter.repository.LoginMongoRepository;
import br.com.impacta.meucondominio.infrastructure.mapper.InfrastructureLoginMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginRepositoryImpl implements LoginRepository {

    private final LoginMongoRepository loginMongoRepository;
    private final InfrastructureLoginMapper mapper;

    @Override
    public void salvar(Login login) {

        var loginEntity = mapper.loginToLoginEntity(login);
        loginMongoRepository.save(loginEntity);

    }

    @Override
    public Login consultar(String email) {
        var optLogin = loginMongoRepository.findById(email);
        return mapper.LoginEntityToLogin(optLogin.get());
    }
}
