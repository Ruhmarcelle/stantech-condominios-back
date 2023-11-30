package br.com.impacta.meucondominio.domain.enums;

import br.com.impacta.meucondominio.domain.model.Setor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public enum SetorEnum {

    ADMINISTRACAO(1, "Administração"),
    LIMPEZA(2, "Limpeza"),
    MANUTENCAO(3, "Manutenção");

    @Getter
    private int id;
    @Getter
    private String nome;

    SetorEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static List getSetor() {
        return Arrays.stream(SetorEnum.values()).map(e -> {
            return Setor.builder()
                    .id(e.getId())
                    .nome(e.getNome())
                    .build();
        }).toList();
    }
}
