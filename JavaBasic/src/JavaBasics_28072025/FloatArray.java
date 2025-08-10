package JavaBasics_28072025;

import java.util.Arrays;

public class FloatArray {
    /**
     * @Array: It is a fixed size
     *         It can store a same type of data
     *         Either we can initialize data to it or we can initialize size of array
     *         By creating an object we can initialize size of an array
     * @Example: int[] val= new int[5];
     *
     * @NonPrimitiveArray: It stores object of user defined class
     *                     initializing an array of an NonPrimitiveClass with any size
     *                     By creating an object we can initialize size
     *                     Using new keyword each element is assigned with a name and age
     * @Example: NonPrimitiveClass[] nonPrimitiveClass = new NonPrimitiveClass[5];
     *
     */
    public static void main(String args[])
    {
        float[] arr = new float[6];

        for(int i = 0; i < arr.length; i++){
            //arr[i] = (float)Math.random();
            arr[i] = i * 7.2f;
        }
        System.out.println("Float array element is: " );

        for (float val : arr) {
            System.out.print(val + " ");
        }

        NonPrimitiveClass[] nonPrimitiveClasses = new NonPrimitiveClass[4];

        NonPrimitiveClass obj1 = new NonPrimitiveClass("Chaitanya",27);
        NonPrimitiveClass obj2 = new NonPrimitiveClass("Sankalp",29);
        NonPrimitiveClass obj3 = new NonPrimitiveClass("Krishna",30);
        NonPrimitiveClass obj4 = new NonPrimitiveClass("Radha",25);

        nonPrimitiveClasses[0] = obj1;
        nonPrimitiveClasses[1] = obj2;
        nonPrimitiveClasses[2] = obj3;
        nonPrimitiveClasses[3] = obj4;

        for (NonPrimitiveClass nonPrimitiveClass : nonPrimitiveClasses) {
            System.out.print(nonPrimitiveClass + " ");
        }





    }
}
