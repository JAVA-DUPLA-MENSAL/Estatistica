package com.exercicio.media.exercicio.Classes;


public class Estatistica {
    private double media;
    private double desvioPadrao;
    private int quantidade;
    private double mediana;

    public Estatistica() {
    }


    public Estatistica(double media, double desvioPadrao, int quantidade, double mediana) {
        this.media = media;
        this.desvioPadrao = desvioPadrao;
        this.quantidade = quantidade;
        this.mediana = mediana;
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getDesvioPadrao() {
        return desvioPadrao;
    }

    public void setDesvioPadrao(double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }


}
