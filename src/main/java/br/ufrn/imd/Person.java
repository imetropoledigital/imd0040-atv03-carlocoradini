package br.ufrn.imd;

public class Person {

    public String name;

    public String hometown;

    public Person() {
        System.out.println("Construtor Person");
    }

    public String hometown() {
        return hometown;
    }

    public String name() {
        return name;
    }

}