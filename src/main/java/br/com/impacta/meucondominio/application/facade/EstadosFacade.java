package br.com.impacta.meucondominio.application.facade;

import br.com.impacta.meucondominio.application.dto.response.EstadosResponseDTO;

import java.util.List;

public interface EstadosFacade {
    public List<EstadosResponseDTO> consultar();
}
