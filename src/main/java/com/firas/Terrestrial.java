package com.firas;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String nom, String famille, int age, boolean enDanger, int nbrLegs) {
        super(nom, famille, age, enDanger);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}
