package br.com.impacta.meucondominio.application.in.controller;

import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.facade.AreaComumFacade;
import br.com.impacta.meucondominio.application.facade.SolicitacaoFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/area-comum")
@RequiredArgsConstructor
public class AreaComumController {

    private final AreaComumFacade areaComumFacade;

    @GetMapping("/consultar")
    public ResponseEntity consultar(){
        return ResponseEntity.ok(areaComumFacade.consultar());
    }
}
