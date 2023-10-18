package br.com.impacta.meucondominio.application.facade.impl;

import br.com.impacta.meucondominio.application.dto.request.CadastroRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastroResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.ConsultaResponseDTO;
import br.com.impacta.meucondominio.application.facade.CadastroFacade;
import br.com.impacta.meucondominio.application.mapper.ApplicationCadastroMapper;
import br.com.impacta.meucondominio.domain.port.in.CadastroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CadastroFacadeImpl implements CadastroFacade {

    private final CadastroService cadastroService;
    private final ApplicationCadastroMapper mapper;

    @Override
    public CadastroResponseDTO salvar(CadastroRequestDTO cadastroRequestDTO) {
        var cadastro = mapper.cadastroRequestDTOToCadastro(cadastroRequestDTO);
        cadastroService.salvar(cadastro);
        return mapper.cadastroToCadastroResponseDTO(cadastro);
    }

    @Override
    public ConsultaResponseDTO consultar(String email) {
        var pessoa = cadastroService.consultar(email);
        return  mapper.cadastroToCadastroEntity(pessoa);
    }
}
