package br.com.impacta.meucondominio.domain.enums;

import br.com.impacta.meucondominio.domain.model.AreaComum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public enum AreaComumEnum {

    HALL_ANDAR(1, "Hall do andar "),
    HALL_PREDIO(2, "Hall do prédio"),
    GARAGEM(3, "Garagem"),
    PISCINA(4, "Piscina"),
    ACADEMIA(5, "Academia"),
    QUADRA_POLIESPORTIVA(6, "Quadra poliesportiva");

    @Getter
    private int id;
    @Getter
    private String nome;

    AreaComumEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static List<AreaComum> getAreaComum() {
        return (List<AreaComum>) Arrays.stream(AreaComumEnum.values()).map(e -> {
            return AreaComum.builder()
                    .id(e.getId())
                    .nome(e.getNome())
                    .build();
        }).toList();
    }
}
