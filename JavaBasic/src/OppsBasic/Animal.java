package OppsBasic;


public class Animal implements Zoo {
    private final String animalName;

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", type='" + type + '\'' +
                ", animalCount=" + animalCount +
                '}';
    }

    private final String type;
    private final int animalCount;



    @Override
    public Animal getAnimalDetails() {
        return this;
    }

    public Animal(String animalName, String type, int animalCount) {
        this.animalName = animalName;
        this.type = type;
        this.animalCount = animalCount;
    }
}


//IMMUTABLE CONCEPT:-
// BY Intializing Contructor
// BY making variable as private Final
