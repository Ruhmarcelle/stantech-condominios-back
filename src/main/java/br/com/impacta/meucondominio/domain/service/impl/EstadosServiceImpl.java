package br.com.impacta.meucondominio.domain.service.impl;

import br.com.impacta.meucondominio.domain.model.AreaComum;
import br.com.impacta.meucondominio.domain.model.Estados;
import br.com.impacta.meucondominio.domain.port.in.AreaComumService;
import br.com.impacta.meucondominio.domain.port.in.EstadosService;
import br.com.impacta.meucondominio.domain.port.out.AreaComumRepository;
import br.com.impacta.meucondominio.domain.port.out.EstadosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstadosServiceImpl implements EstadosService {

    private final EstadosRepository estadosRepository;

    @Override
    public List<Estados> consultar() {
        return estadosRepository.consultar();
    }
}
