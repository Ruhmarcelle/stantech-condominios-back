package br.com.impacta.meucondominio.application.facade.impl;

import br.com.impacta.meucondominio.application.dto.response.SetorResponseDTO;
import br.com.impacta.meucondominio.application.facade.SetorFacade;
import br.com.impacta.meucondominio.application.mapper.ApplicationSetorMapper;
import br.com.impacta.meucondominio.domain.port.in.SetorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SetorFacadeImpl implements SetorFacade {

    private final SetorService setorService;
    private final ApplicationSetorMapper mapper;

    @Override
    public List<SetorResponseDTO> consultar() {
        return mapper.setorToSetorResponseDTO(setorService.consultar());
    }
}
