package br.com.impacta.meucondominio.domain.port.in;

public interface GeradorSequenceService {

    public long gerarSequence(String nomeSequence);

    public long gerarSequenceUsuario(String nomeSequence);
}
