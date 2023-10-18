package br.com.impacta.meucondominio.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Unidade {
    private String apartamento;
    private String bloco;
}
