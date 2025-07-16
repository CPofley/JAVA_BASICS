package OppsBasic;

public class Bird extends Animal{


    public Bird(String animalType,String animalName,int animalCount)
    {
        super(animalType,animalName,animalCount);
    }

    public static void main(String[] args) {

        Bird bird = new Bird("Bird","Parrot",39);
        System.out.println(bird.getAnimalDetails());
    }
}
