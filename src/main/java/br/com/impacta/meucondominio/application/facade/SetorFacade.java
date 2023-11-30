package br.com.impacta.meucondominio.application.facade;

import br.com.impacta.meucondominio.application.dto.response.SetorResponseDTO;

import java.util.List;

public interface SetorFacade {
    public List<SetorResponseDTO> consultar();
}
