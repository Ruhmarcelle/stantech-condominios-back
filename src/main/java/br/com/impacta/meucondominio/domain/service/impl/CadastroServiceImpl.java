package br.com.impacta.meucondominio.domain.service.impl;

import br.com.impacta.meucondominio.domain.model.Cadastro;
import br.com.impacta.meucondominio.domain.port.in.LoginService;
import br.com.impacta.meucondominio.domain.port.out.CadastroRepository;
import br.com.impacta.meucondominio.domain.port.in.CadastroService;
import br.com.impacta.meucondominio.domain.port.out.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroServiceImpl implements CadastroService {

    private final CadastroRepository cadastroRepository;
    private final LoginRepository loginRepository;
    private final LoginService LoginService;

    @Override
    public Cadastro consultar(String email) {
        return cadastroRepository.consultar(email);
    }

    @Override
    public void salvar(Cadastro cadastro) {
        cadastroRepository.salvar(cadastro);
        loginRepository.salvar(cadastro.getLogin());
    }
}
