package com.firas;



public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Animal("Lion", "Felidae", 5, true));
        zoo.addAnimal(new Animal("Beb", "Felidae", 8, true));
        zoo.addAnimal(new Animal("djeja", "Felidae", 4, true));
        zoo.addAnimal(new Animal("waza", "Felidae", 31, true));

        Zoo zoo2 = new Zoo();
        zoo.addAnimal(new Animal("nemel", "Felidae", 5, true));
        zoo.addAnimal(new Animal("7mema", "Felidae", 8, true));
        zoo.addAnimal(new Animal("wbata", "Felidae", 4, true));
        zoo.addAnimal(new Animal("kaleb", "Felidae", 31, true));
        zoo.addAnimal(new Animal("sardouk", "Felidae", 8, true));

        System.out.println("The zoo has " + zoo.getCount() + " animals.");
        System.out.println("The animals in the zoo are: ");
        zoo.printAnimals();
        System.out.println("The Lion  index is : " + zoo.SearchAnimal(new Animal("Lion")));
        System.out.println("if there is no index: " + zoo.SearchAnimal(new Animal("404not found")));
        zoo.removeAnimal(new Animal("Lion"));
        zoo.removeAnimal(new Animal("Beb"));
        System.out.println("The zoo has " + zoo.getCount() + " animals.");
        zoo.printAnimals();

System.out.println("--------------------------------------");




    }
}