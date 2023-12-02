package br.com.impacta.meucondominio.domain.enums;

import br.com.impacta.meucondominio.domain.model.Setor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum SetorEnum {

    ADMINISTRACAO(0, "Administração"),
    LIMPEZA(1, "Limpeza"),
    MANUTENCAO(2, "Manutenção");

    @Getter
    private int id;
    @Getter
    private String nome;

    SetorEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static Setor getSetor(int id){
        return listarSetor().get(id);
    }
    public static List<Setor> listarSetor() {
        return Arrays.stream(SetorEnum.values()).map(e -> {
            return Setor.builder()
                    .id(e.getId())
                    .nome(e.getNome())
                    .build();
        }).collect(Collectors.toList());
    }
}
