package br.com.impacta.meucondominio.domain.service.impl;

import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.SolicitacaoResponseDTO;
import br.com.impacta.meucondominio.application.facade.SolicitacaoFacade;
import br.com.impacta.meucondominio.domain.exception.LoginException;
import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.domain.port.in.CadastroService;
import br.com.impacta.meucondominio.domain.port.in.GeradorSequenceService;
import br.com.impacta.meucondominio.domain.port.in.LoginService;
import br.com.impacta.meucondominio.domain.port.in.SolicitacaoService;
import br.com.impacta.meucondominio.domain.port.out.LoginRepository;
import br.com.impacta.meucondominio.domain.port.out.SolicitacaoRepository;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;
import static org.apache.logging.log4j.util.Strings.EMPTY;

@Service
@RequiredArgsConstructor
public class SolicitacaoServiceImpl implements SolicitacaoService {

    private String SOLICITACAO_SAVED = "Solicitação %s cadastrada com sucesso !";
    private String PREFIXO_SOLICITACAO = "CO";

    private final SolicitacaoRepository solicitacaoRepository;
    private final GeradorSequenceService geradorSequenceService;

    private final CadastroService cadastroService;

    @Override
    public Solicitacao salvar(Solicitacao solicitacao) {

        var cadastro = cadastroService.consultar(solicitacao.getEmail());

        var sequence = geradorSequenceService.gerarSequence(SolicitacaoEntity.SEQUENCE_NAME);
        solicitacao.setIdSolicitacao(
                PREFIXO_SOLICITACAO
                        .concat(cadastro.getUnidade().getApartamento())
                        .concat(isNull(cadastro.getUnidade().getBloco()) ? EMPTY : cadastro.getUnidade().getBloco())
                        .concat(String.valueOf(sequence))
        );
        solicitacaoRepository.salvar(solicitacao);

        solicitacao.setMenssagem(String.format(SOLICITACAO_SAVED, solicitacao.getIdSolicitacao()));
        return solicitacao;
    }

    @Override
    public Solicitacao consultar(String idSolicitacao) {
        return solicitacaoRepository.consultar(idSolicitacao);
    }
}
