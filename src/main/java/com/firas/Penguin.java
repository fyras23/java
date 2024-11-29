package com.firas;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String nom, String famille, int age, boolean enDanger, String habitat, float swimmingDepth) {
        super(nom, famille, age, enDanger, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
