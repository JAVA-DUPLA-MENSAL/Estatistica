package com.exercicio.media.exercicio.Controller;

import com.exercicio.media.exercicio.Classes.Estatistica;
import com.exercicio.media.exercicio.Service.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/api/estatistica")
public class EstatisticaController {

    private final EstatisticaService estatisticaService;

    @Autowired
    public EstatisticaController(EstatisticaService estatisticaService) {
        this.estatisticaService = estatisticaService;
    }

    @PostMapping("/calcular")
    public Estatistica calcularEstatisticas(@RequestBody double[] valores) {
        return estatisticaService.calcularEstatisticas(valores);
    }
}
