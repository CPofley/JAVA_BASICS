package ImmutableClassExample;

import java.util.Date;

public class ImmutableMainClass {
    public static void main(String[] args){
//        MutableClass obj = new MutableClass();
//        obj.setAge(27);
//        obj.setName("Chaitanya");
//        obj.setDob(new Date());
//        int identityHashCode = System.identityHashCode(obj);
//        System.out.println("Identity Hash Code: " + identityHashCode);
//        System.out.println(obj);
//
//        obj.setAge(28);
//        identityHashCode = System.identityHashCode(obj);
//        System.out.println("Identity Hash Code: " + identityHashCode);
//        System.out.println(obj);

        //IMMUTABLE CLASS
        ImmutableClass immutableClass = new ImmutableClass(29,"SANKALP",new Date());
        int identityHashCode = System.identityHashCode(immutableClass);
        System.out.println("Identity Hash Code: " + identityHashCode);
        System.out.println(immutableClass);

        immutableClass = new ImmutableClass(32,"BHUSHAN",new Date());
        identityHashCode = System.identityHashCode(immutableClass);
        System.out.println("Identity Hash Code: " + identityHashCode);
        System.out.println(immutableClass);



    }
}
