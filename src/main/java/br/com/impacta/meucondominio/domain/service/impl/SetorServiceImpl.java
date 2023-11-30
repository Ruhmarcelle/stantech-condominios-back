package br.com.impacta.meucondominio.domain.service.impl;

import br.com.impacta.meucondominio.domain.model.Setor;
import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.domain.port.in.CadastroService;
import br.com.impacta.meucondominio.domain.port.in.GeradorSequenceService;
import br.com.impacta.meucondominio.domain.port.in.SetorService;
import br.com.impacta.meucondominio.domain.port.in.SolicitacaoService;
import br.com.impacta.meucondominio.domain.port.out.SetorRepository;
import br.com.impacta.meucondominio.domain.port.out.SolicitacaoRepository;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;
import static org.apache.logging.log4j.util.Strings.EMPTY;

@Service
@RequiredArgsConstructor
public class SetorServiceImpl implements SetorService {

    private final SetorRepository setorRepository;

    @Override
    public List<Setor> consultar() {
        return setorRepository.consultar();
    }
}
