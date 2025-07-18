package OppsBasic;

import java.util.List;

public class Mammal extends Animal {

    public static void main(String[] args) {
        Mammal mammal = new Mammal("Mammal","Tiger",345);
        Mammal mammal1 = new Mammal("Mammal","Elephant",34);

        Animal animal = mammal.getAnimalDetails();
        Animal animal1 = mammal1.getAnimalDetails();

        System.out.println(animal);
        System.out.println(animal1);


    }
    public Mammal(String animalType, String animalName, int animalCount) {
        super(animalType,animalName,animalCount);
    }
}
