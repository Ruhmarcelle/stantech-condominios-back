package br.com.impacta.meucondominio.domain.enums;

import br.com.impacta.meucondominio.domain.model.AreaComum;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum AreaComumEnum {

    HALL_ANDAR(0, "Hall do andar "),
    HALL_PREDIO(1, "Hall do prédio"),
    GARAGEM(2, "Garagem"),
    PISCINA(3, "Piscina"),
    ACADEMIA(4, "Academia"),
    QUADRA_POLIESPORTIVA(5, "Quadra poliesportiva");

    @Getter
    private int id;
    @Getter
    private String nome;

    AreaComumEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static AreaComum getAreaComum(int id){
        return listarAreaComum().get(id);
    }
    public static List<AreaComum> listarAreaComum() {
        return Arrays.stream(AreaComumEnum.values()).map(e -> {
            return AreaComum.builder()
                    .id(e.getId())
                    .nome(e.getNome())
                    .build();
        }).collect(Collectors.toList());
    }
}
