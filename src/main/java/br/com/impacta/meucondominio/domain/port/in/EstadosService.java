package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.Estados;
import br.com.impacta.meucondominio.domain.model.Setor;

import java.util.List;

public interface EstadosService {

    public List<Estados> consultar();
}
