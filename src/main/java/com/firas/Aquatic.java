package com.firas;

public class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String nom, String famille, int age, boolean enDanger, String habitat) {
        super(nom, famille, age, enDanger);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + '\'';
    }
}
