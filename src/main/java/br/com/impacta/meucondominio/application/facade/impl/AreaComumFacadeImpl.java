package br.com.impacta.meucondominio.application.facade.impl;

import br.com.impacta.meucondominio.application.dto.response.AreaComumResponseDTO;
import br.com.impacta.meucondominio.application.facade.AreaComumFacade;
import br.com.impacta.meucondominio.application.mapper.ApplicationAreaComumMapper;
import br.com.impacta.meucondominio.domain.port.in.AreaComumService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AreaComumFacadeImpl implements AreaComumFacade {

    private final AreaComumService areaComumService;
    private final ApplicationAreaComumMapper mapper;

    @Override
    public List<AreaComumResponseDTO> consultar() {

        return mapper.areaComumToAreaComumResponseDTO(areaComumService.consultar());
    }
}
