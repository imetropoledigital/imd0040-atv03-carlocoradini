package br.ufrn.imd;

public class GuitarPlayer extends Musician {

    public int howManyYears;

    public boolean playEletronicGuitar;

    public boolean playAcousticGuitar;

    public GuitarPlayer() {
        System.out.println("Construtor de GuitarPlayer");
    }

    public void playGuitar() {
        System.out.println("GuitarPlayer Plays");
    }

}