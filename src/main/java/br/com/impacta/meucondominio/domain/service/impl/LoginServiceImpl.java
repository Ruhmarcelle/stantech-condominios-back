package br.com.impacta.meucondominio.domain.service.impl;

import br.com.impacta.meucondominio.domain.exception.LoginException;
import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.port.in.GeradorSequenceService;
import br.com.impacta.meucondominio.domain.port.in.LoginService;
import br.com.impacta.meucondominio.domain.port.out.LoginRepository;
import br.com.impacta.meucondominio.infrastructure.entity.LoginEntity;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import static org.apache.logging.log4j.util.Strings.EMPTY;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final String LOGIN_FAIL = "Usuário ou senha inválido !";
    private final String CADASTRO_FAIL = "Email informado já está cadastrado.!";
    private String LOGIN_SUCSESS = "Bem vindo, %s =)";

    private String LOGIN_SAVED = "Login, %s cadastrao com sucesso !";

    private final LoginRepository loginRepository;

    private final GeradorSequenceService geradorSequenceService;

    @Override
    public Login salvar(Login login) {

        var loginConsultado = loginRepository.consultar(login.getEmail());

        if(loginConsultado != null)
            throw new LoginException(CADASTRO_FAIL);

        var sequence = geradorSequenceService.gerarSequenceUsuario(LoginEntity.SEQUENCE_NAME);

        login.setId(sequence);

        loginRepository.salvar(login);

        login.setMensagem(String.format(LOGIN_SAVED, login.getEmail()));

        return login;
    }

    @Override
    public Login validar(Login login) {

        var loginDb = loginRepository.consultar(login.getEmail());

        if(login.getSenha().trim().equals(loginDb.getSenha().trim())){
            login.setMensagem(String.format(LOGIN_SUCSESS, login.getEmail()));
            login.setSenha(EMPTY);
            return login;
        }

        throw new LoginException(LOGIN_FAIL);
    }
}
