package br.com.impacta.meucondominio.domain.enums;

import org.springframework.stereotype.Component;

public enum SetorEnum {

    ADMINISTRACAO("Administração"),
    LIMPEZA("Limpeza"),
    MANUTENCAO("Manutenção");

    private String descricao;

    SetorEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
