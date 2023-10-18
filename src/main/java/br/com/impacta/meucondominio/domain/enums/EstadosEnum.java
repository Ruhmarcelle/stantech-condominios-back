package br.com.impacta.meucondominio.domain.enums;

import br.com.impacta.meucondominio.domain.model.Estados;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public enum EstadosEnum {

    SAO_PAULO(1, "São Paulo","SP"),
    RIO_JANEIRO(2, "Rio de Janeiro", "RJ"),
    MINAS_GERAIS(3, "Minas Gerais", "MG");

    private int id;
    private String nome;
    private String sigla;

    EstadosEnum(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public static List<Estados> getEstados() {

        ArrayList<Estados> lista = new ArrayList<>();

        for (EstadosEnum estadosEnum : EstadosEnum.values()){
            lista.add(new Estados(estadosEnum.id, estadosEnum.nome, estadosEnum.sigla));
        }
        return lista;
    }
}
