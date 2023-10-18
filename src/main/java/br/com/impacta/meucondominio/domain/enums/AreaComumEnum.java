package br.com.impacta.meucondominio.domain.enums;

public enum AreaComumEnum {

    HALL_ANDAR("Hall do andar "),
    HALL_PREDIO("Hall do prédio"),
    GARAGEM("Garagem"),
    PISCINA("Piscina"),
    ACADEMIA("Academia"),
    QUADRA_POLIESPORTIVA("Quadra poliesportiva");

    private String descricao;

    AreaComumEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
