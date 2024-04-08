package br.ufrn.imd;


public class Musician extends Person {

    public boolean playClassicalMusic;

    public boolean canImprovise;

    public boolean canCompose;

    public Musician() {
        System.out.println("Construtor Musician");
    }

    public void play() {
        System.out.println("Musician Plays");
    }
}