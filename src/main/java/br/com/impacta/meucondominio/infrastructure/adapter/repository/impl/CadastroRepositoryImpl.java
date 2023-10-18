package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;

import br.com.impacta.meucondominio.domain.model.Cadastro;
import br.com.impacta.meucondominio.domain.port.out.CadastroRepository;
import br.com.impacta.meucondominio.infrastructure.adapter.repository.CadastroMongoRepository;
import br.com.impacta.meucondominio.infrastructure.entity.CadastroEntity;
import br.com.impacta.meucondominio.infrastructure.mapper.InfrastructureCadastroMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CadastroRepositoryImpl implements CadastroRepository {

    private final CadastroMongoRepository cadastroMongoRepository;
    private final InfrastructureCadastroMapper mapper;

    @Override
    public void salvar(Cadastro cadastro) {

        var cadastroEntity = mapper.cadastroToCadastroEntity(cadastro);
        cadastroMongoRepository.save(cadastroEntity);
    }

    @Override
    public Cadastro consultar(String email) {

        var optCadastro = cadastroMongoRepository.findById(email);
        return mapper.OptionalCadastroEntityToCadastro(optCadastro.get());
    }
}
