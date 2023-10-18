package br.com.impacta.meucondominio.application.facade;

import br.com.impacta.meucondominio.application.dto.request.CadastroRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastroResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.ConsultaResponseDTO;

public interface CadastroFacade {

    public CadastroResponseDTO salvar(CadastroRequestDTO cadastrarMoradorRequestDTO);
    public ConsultaResponseDTO consultar(String email);
}
