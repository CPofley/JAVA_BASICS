package JavaBasics_23072025;

import java.util.Scanner;

public class JavaBasics {

    /**
     * @StaticBlock -If we need to execute anything before main method then we can make this block.
     * @StaticExample - Access static method and variable by using this class name.
     *
     */

    /**
     * @Static Use - If we want to access the properties of any class without creating its object.
     * @Static Access - this can be access using (className.propertyName)
     * @Within Class - Directly we can use properties(without using class name)
     * @Example: calculate()
     * @Outside class - By using class name we can access the properties
     * @Examaple: StaticExample.display(),StaticExample.num1
     */
    static {

        System.out.println("Sum of example is " + (StaticExample.num1 + StaticExample.num2));
        StaticExample.display();
    }

    /**
     * @Scanner - for taking user input
     * @nextInt() - for accepting integer input
     * @next() - for accepting string input
     * @parseInt -it converts string into integer
     * @calculate - Static method which adds two number and returns sum
     * @param int num1,int num2
     *
     * @param args - To provide runtime argument to main method
     */
    public static void main(String[] args)
    {
        System.out.println("Enter first num");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second num");
        int num2 = sc.nextInt();

        int sum = calculate(num1,num2);
        System.out.println("The sum is: " + sum);

        System.out.println("Enter first string");
        String str1 = sc.next();
        System.out.println("Enter second string");
        String str2 = sc.next();

        System.out.println(str1 + str2);

        System.out.println("Enter first num as string");
        String numstr1   = sc.next();
        int pNum1 = Integer.parseInt(numstr1);

        System.out.println("enter second num as string");
        String numstr2 = sc.next();
        int pNum2 = Integer.parseInt(numstr2);

        int stringSum = calculate(pNum1,pNum2);
        System.out.println("The sum is: " + stringSum);


    }
    public static int calculate(int num1, int num2){
        return num1+num2;
    }

}
