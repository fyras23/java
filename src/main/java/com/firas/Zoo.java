package com.firas;

public class Zoo {
    private Animal[] animals;
    private int count;
    private final int NBR_CAGES = 25;


    public Zoo() {
        animals = new Animal[NBR_CAGES];
        count = 0;
    }

    public boolean isFull() {
        return count >= NBR_CAGES;
    }


    public boolean addAnimal(Animal animal) {
        if( count > animals.length){
            System.out.println("The zoo is full");
            return false;
        }
        if (SearchAnimal(animal) != -1) {
            System.out.println("The animal is already in the zoo");
            return false;
        }

        if (count < animals.length) {
            animals[count] = animal;
            count++;
            return true;
        }
        return false;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public void printAnimals() {
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i].getNom());
        }
    }

    public int getCount() {
        return count;
    }
    public int SearchAnimal(Animal animal) {
        for (int i = 0; i < count; i++) {
            if (animals[i].getNom().equals(animal.getNom())) {
                return i;
            }
        }
        return -1;
    }

    public void removeAnimal(Animal animal){
        int index = SearchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                animals[i] = animals[i + 1];
            }
            count--;
        }
    }
}
