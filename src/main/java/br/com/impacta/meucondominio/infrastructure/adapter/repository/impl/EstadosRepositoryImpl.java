package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;


import br.com.impacta.meucondominio.domain.enums.EstadosEnum;
import br.com.impacta.meucondominio.domain.enums.SetorEnum;
import br.com.impacta.meucondominio.domain.model.Estados;
import br.com.impacta.meucondominio.domain.model.Setor;
import br.com.impacta.meucondominio.domain.port.out.EstadosRepository;
import br.com.impacta.meucondominio.domain.port.out.SetorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EstadosRepositoryImpl implements EstadosRepository {

    @Override
    public List<Estados> consultar() {
        return EstadosEnum.getEstados();
    }
}
