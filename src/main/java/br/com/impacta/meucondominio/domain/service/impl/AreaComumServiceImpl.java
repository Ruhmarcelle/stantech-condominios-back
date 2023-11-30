package br.com.impacta.meucondominio.domain.service.impl;

import br.com.impacta.meucondominio.domain.model.AreaComum;
import br.com.impacta.meucondominio.domain.port.in.AreaComumService;
import br.com.impacta.meucondominio.domain.port.out.AreaComumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AreaComumServiceImpl implements AreaComumService {

    private final AreaComumRepository areaComumRepository;

    @Override
    public List<AreaComum> consultar() {
        return areaComumRepository.consultar();
    }
}
