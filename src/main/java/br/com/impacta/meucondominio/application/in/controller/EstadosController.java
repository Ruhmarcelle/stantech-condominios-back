package br.com.impacta.meucondominio.application.in.controller;

import br.com.impacta.meucondominio.application.facade.AreaComumFacade;
import br.com.impacta.meucondominio.application.facade.EstadosFacade;
import br.com.impacta.meucondominio.domain.enums.EstadosEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estados")
@RequiredArgsConstructor
public class EstadosController {

    private final EstadosFacade estadosFacade;

    @GetMapping("/consultar")
    public ResponseEntity consultar(){
        return ResponseEntity.ok(estadosFacade.consultar());
    }
}
