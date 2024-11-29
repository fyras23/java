package com.firas;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String nom, String famille, int age, boolean enDanger, String habitat, float swimmingSpeed) {
        super(nom, famille, age, enDanger, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
}
