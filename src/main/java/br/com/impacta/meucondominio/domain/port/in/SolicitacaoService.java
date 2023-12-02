package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Solicitacao;

import java.util.List;

public interface SolicitacaoService {

    public Solicitacao salvar(Solicitacao solicitacao);
    public Solicitacao consultar(String idSolicitacao);

    public List<Solicitacao> listar(String email);
}
