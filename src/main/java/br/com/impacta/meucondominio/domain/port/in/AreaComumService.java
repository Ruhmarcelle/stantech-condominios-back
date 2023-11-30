package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.AreaComum;
import br.com.impacta.meucondominio.domain.model.Solicitacao;

import java.util.List;

public interface AreaComumService {

    public List<AreaComum> consultar();
}
