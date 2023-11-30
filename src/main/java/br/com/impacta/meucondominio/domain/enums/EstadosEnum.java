package br.com.impacta.meucondominio.domain.enums;

import br.com.impacta.meucondominio.domain.model.Estados;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public enum EstadosEnum {

    SAO_PAULO(1, "São Paulo","SP"),
    RIO_JANEIRO(2, "Rio de Janeiro", "RJ"),
    MINAS_GERAIS(3, "Minas Gerais", "MG");

    @Getter
    private int id;
    @Getter
    private String nome;
    @Getter
    private String sigla;

    EstadosEnum(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public static List getEstados() {
        return Arrays.stream(EstadosEnum.values()).map(e -> {
            return Estados.builder()
                    .id(e.getId())
                    .nome(e.getNome())
                    .sigla(e.getSigla())
                    .build();
        }).toList();
    }
}
