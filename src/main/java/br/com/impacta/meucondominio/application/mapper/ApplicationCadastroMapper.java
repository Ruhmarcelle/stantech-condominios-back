package br.com.impacta.meucondominio.application.mapper;

import br.com.impacta.meucondominio.application.dto.request.CadastroRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastroResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.ConsultaResponseDTO;
import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Unidade;
import br.com.impacta.meucondominio.domain.model.Cadastro;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ApplicationCadastroMapper {

    private final String MORADOR_CADASTRADO_SUCESSO = "Morador Cadastrado com sucesso !";
    public ConsultaResponseDTO cadastroToCadastroEntity(Cadastro cadastro){

        return ConsultaResponseDTO.builder()
                .cpf(cadastro.getCpf())
                .nome(cadastro.getNome())
                .email(cadastro.getEmail())
                .contato(cadastro.getContato())
                .unidade(cadastro.getUnidade())
                .build();
    }

    public CadastroResponseDTO cadastroToCadastroResponseDTO(Cadastro cadastro){
        return CadastroResponseDTO.builder()
                .nome(cadastro.getNome())
                .mensagem(MORADOR_CADASTRADO_SUCESSO)
                .build();
    }

    public Cadastro cadastroRequestDTOToCadastro(CadastroRequestDTO cadastroRequestDTO){
        return Cadastro.builder()
                .cpf(cadastroRequestDTO.getCpf())
                .nome(cadastroRequestDTO.getNome())
                .email(cadastroRequestDTO.getEmail())
                .contato(cadastroRequestDTO.getContato())
                .dataCadastro(cadastroRequestDTO.getDataCadastro())
                .unidade(Unidade.builder()
                        .apartamento(cadastroRequestDTO.getUnidade().getApartamento())
                        .bloco(cadastroRequestDTO.getUnidade().getBloco())
                        .build())
                .login(Login.builder()
                        .email(cadastroRequestDTO.getEmail())
                        .senha(cadastroRequestDTO.getLogin().getSenha())
                        .build())
                .build();
    }
}
