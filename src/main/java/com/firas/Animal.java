package com.firas;

public class Animal {
    private String nom;
    private String famille;
    private int age;
    private boolean enDanger;

    public Animal(String nom) {
        this.nom = nom;
    }

    public Animal(String nom, String famille, int age, boolean enDanger) {
        this.nom = nom;
        this.famille = famille;
        this.age = age;
        this.enDanger = enDanger;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (!nom.isEmpty()) {
            this.nom = nom;
        }
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEnDanger() {
        return enDanger;
    }

    public void setEnDanger(boolean enDanger) {
        this.enDanger = enDanger;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", famille='" + famille + '\'' +
                ", age=" + age +
                ", enDanger=" + enDanger +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return nom.equals(animal.nom);
    }
}
