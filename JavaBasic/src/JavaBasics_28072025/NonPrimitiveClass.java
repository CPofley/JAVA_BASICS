package JavaBasics_28072025;

public class NonPrimitiveClass {
    String name;
    int age;

    @Override
    public String toString() {
        return "NonPrimitiveClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    NonPrimitiveClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
