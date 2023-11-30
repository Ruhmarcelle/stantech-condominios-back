package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.Setor;
import br.com.impacta.meucondominio.domain.model.Solicitacao;

import java.util.List;

public interface SetorService {

    public List<Setor> consultar();
}
