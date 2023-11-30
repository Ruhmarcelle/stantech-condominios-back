package br.com.impacta.meucondominio.application.facade;

import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.AreaComumResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.SolicitacaoResponseDTO;

import java.util.List;

public interface AreaComumFacade {
    public List<AreaComumResponseDTO> consultar();
}
