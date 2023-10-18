package br.com.impacta.meucondominio.infrastructure.mapper;

import br.com.impacta.meucondominio.domain.model.Cadastro;
import br.com.impacta.meucondominio.domain.model.Unidade;
import br.com.impacta.meucondominio.infrastructure.entity.CadastroEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class InfrastructureCadastroMapper {

    public CadastroEntity cadastroToCadastroEntity(Cadastro cadastro){

        return CadastroEntity.builder()
                .email(cadastro.getEmail())
                .cpf(cadastro.getCpf())
                .nome(cadastro.getNome())
                .contato(cadastro.getContato())
                .dataCadastro(cadastro.getDataCadastro())
                .unidade(Unidade.builder()
                        .apartamento(cadastro.getUnidade().getApartamento())
                        .bloco(cadastro.getUnidade().getBloco())
                        .build())
                .build();
    }

    public Cadastro OptionalCadastroEntityToCadastro(CadastroEntity pessoaEntity){

        return Cadastro.builder()
                .email(pessoaEntity.getEmail())
                .cpf(pessoaEntity.getCpf())
                .nome(pessoaEntity.getNome())
                .contato(pessoaEntity.getContato())
                .unidade(Unidade.builder()
                        .apartamento(pessoaEntity.getUnidade().getApartamento())
                        .bloco(pessoaEntity.getUnidade().getBloco())
                        .build())
                .build();
    }
}
