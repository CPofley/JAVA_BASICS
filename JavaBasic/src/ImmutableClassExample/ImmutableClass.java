package ImmutableClassExample;

import java.util.Date;

public class ImmutableClass {
    /**
     * How to make a class immutable ???
     * 1. Dont create setters for the fields , only keep getter()
     * 2. Make all the fields final
     * 3. Initialize fields inside constructor i.e use parameterized constructor to initialize them.
     */
    private final int age;
    private final String name;
    private final Date dob;

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    public ImmutableClass(int age, String name, Date dob){
        this.age = age;
        this.name = name;
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }



}
