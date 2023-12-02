package br.com.impacta.meucondominio.domain.enums;

public enum StatusEnum {

    EM_ABERTO("Aberto"),
    EM_ANÁLISE("Em análise"),
    CONCUIDO("Concluído"),
    CANCELADO("Cancelado");

    private String descricao;

    StatusEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
