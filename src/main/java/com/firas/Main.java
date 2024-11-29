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

        Dolphin dolphin = new Dolphin("Flipper", "Cetacea", 8, false, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Pingu", "Spheniscidae", 5, false, "Antarctica", 15.2f);
        Terrestrial lion = new Terrestrial("Lion", "Felidae", 10, true, 4);
        Aquatic fish = new Aquatic("Goldfish", "Carp", 1, false, "Pond");

        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(lion);
        System.out.println(fish);

        dolphin.swim();
        penguin.swim();
        fish.swim();


    }
}