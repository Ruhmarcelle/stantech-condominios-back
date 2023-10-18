package br.com.impacta.meucondominio.application.facade;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.LoginResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.SolicitacaoResponseDTO;

public interface SolicitacaoFacade {
    public SolicitacaoResponseDTO salvar(SolicitacaoRequestDTO solicitacaoRequestDTO);
    public SolicitacaoResponseDTO consultar(String idSolicitacao);
}
