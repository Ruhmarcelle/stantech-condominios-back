package br.com.impacta.meucondominio.application.in.controller;

import br.com.impacta.meucondominio.application.dto.request.CadastroRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastroResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.ConsultaResponseDTO;
import br.com.impacta.meucondominio.application.facade.CadastroFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
@RequiredArgsConstructor
public class CadastroController {

    private final CadastroFacade cadastroFacade;

    @GetMapping("/consultar/{email}")
    public ResponseEntity<ConsultaResponseDTO> consultar(@PathVariable String email){
        return ResponseEntity.ok(cadastroFacade.consultar(email));
    }

    @PostMapping
    public ResponseEntity<CadastroResponseDTO> salvar(@Valid @RequestBody CadastroRequestDTO cadastroRequestDTO){
        return ResponseEntity.ok(cadastroFacade.salvar(cadastroRequestDTO));
    }
}
