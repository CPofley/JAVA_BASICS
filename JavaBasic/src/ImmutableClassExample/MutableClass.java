package ImmutableClassExample;

import java.util.Date;

public class MutableClass {


    private int age;
    private String name;
    private Date dob;

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
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
