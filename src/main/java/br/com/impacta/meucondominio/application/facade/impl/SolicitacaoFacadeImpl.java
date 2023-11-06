package br.com.impacta.meucondominio.application.facade.impl;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.LoginResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.SolicitacaoResponseDTO;
import br.com.impacta.meucondominio.application.facade.LoginFacade;
import br.com.impacta.meucondominio.application.facade.SolicitacaoFacade;
import br.com.impacta.meucondominio.application.mapper.ApplicationLoginMapper;
import br.com.impacta.meucondominio.application.mapper.ApplicationSolicitacaoMapper;
import br.com.impacta.meucondominio.domain.port.in.LoginService;
import br.com.impacta.meucondominio.domain.port.in.SolicitacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SolicitacaoFacadeImpl implements SolicitacaoFacade {

    private final SolicitacaoService solicitacaoService;
    private final ApplicationSolicitacaoMapper mapper;

    @Override
    public SolicitacaoResponseDTO salvar(SolicitacaoRequestDTO solicitacaoRequestDTO) {
        var solicitacao = mapper.solicitacaoRequestDTOToSolicitacao(solicitacaoRequestDTO);
        return mapper.solicitacaoToSolicitacaoResponseDTO(solicitacaoService.salvar(solicitacao));
    }

    @Override
    public SolicitacaoResponseDTO consultar(String idSolicitacao) {

        var solicitacao = solicitacaoService.consultar(idSolicitacao);
        return mapper.solicitacaoToSolicitacaoResponseDTO(solicitacaoService.consultar(idSolicitacao));
    }
}
