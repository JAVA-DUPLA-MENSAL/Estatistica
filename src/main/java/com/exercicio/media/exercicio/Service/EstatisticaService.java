package com.exercicio.media.exercicio.Service;

import com.exercicio.media.exercicio.Classes.Estatistica;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class EstatisticaService {

    public Estatistica calcularEstatisticas(double[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("A lista de valores não pode ser vazia");
        }

        for (double valor : valores) {
            if (Double.isNaN(valor) || Double.isInfinite(valor)) {
                throw new IllegalArgumentException("Os valores devem ser números válidos");
            }
        }

        Estatistica resposta = new Estatistica();
        resposta.setMedia(calcularMedia(valores));
        resposta.setDesvioPadrao(calcularDesvioPadrao(valores, resposta.getMedia()));
        resposta.setQuantidade(valores.length);
        resposta.setMediana(calcularMediana(valores));
        return resposta;
    }

    private double calcularMedia(double[] valores) {
        double soma = Arrays.stream(valores).sum();
        return soma / valores.length;
    }

    private double calcularDesvioPadrao(double[] valores, double media) {
        double somaDiferencasQuadradas = Arrays.stream(valores)
                .map(valor -> Math.pow(valor - media, 2))
                .sum();
        double variancia = somaDiferencasQuadradas / valores.length;
        return Math.sqrt(variancia);
    }

    private double calcularMediana(double[] valores) {
        Arrays.sort(valores);
        int tamanho = valores.length;
        if (tamanho % 2 == 0) {
            return (valores[tamanho / 2 - 1] + valores[tamanho / 2]) / 2;
        } else {
            return valores[tamanho / 2];
        }
    }
}
