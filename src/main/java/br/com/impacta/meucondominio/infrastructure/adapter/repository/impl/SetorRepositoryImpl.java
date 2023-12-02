package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;


import br.com.impacta.meucondominio.domain.enums.SetorEnum;
import br.com.impacta.meucondominio.domain.model.Setor;
import br.com.impacta.meucondominio.domain.port.out.SetorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SetorRepositoryImpl implements SetorRepository {

    @Override
    public List<Setor> consultar() {
        return SetorEnum.listarSetor();
    }
    @Override
    public Setor consultarSetor(int id) {
        return SetorEnum.getSetor(id);
    }
}
