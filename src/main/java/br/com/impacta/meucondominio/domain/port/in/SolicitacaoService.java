package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Solicitacao;

public interface SolicitacaoService {

    public Solicitacao salvar(Solicitacao solicitacao);
    public Solicitacao consultar(String idSolicitacao);
}
