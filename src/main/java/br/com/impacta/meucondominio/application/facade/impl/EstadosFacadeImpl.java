package br.com.impacta.meucondominio.application.facade.impl;

import br.com.impacta.meucondominio.application.dto.response.EstadosResponseDTO;
import br.com.impacta.meucondominio.application.facade.EstadosFacade;
import br.com.impacta.meucondominio.application.facade.SetorFacade;
import br.com.impacta.meucondominio.application.mapper.ApplicationEstadosMapper;
import br.com.impacta.meucondominio.application.mapper.ApplicationSetorMapper;
import br.com.impacta.meucondominio.domain.port.in.EstadosService;
import br.com.impacta.meucondominio.domain.port.in.SetorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EstadosFacadeImpl implements EstadosFacade {

    private final EstadosService estadosService;
    private final ApplicationEstadosMapper mapper;

    @Override
    public List<EstadosResponseDTO> consultar() {
        return mapper.setorToSetorResponseDTO(estadosService.consultar());
    }
}
