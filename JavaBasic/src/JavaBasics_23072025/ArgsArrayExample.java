package JavaBasics_23072025;

public class ArgsArrayExample {

    public static void main(String[] args) {

        if(args.length <= 2){
            System.out.println("Please enter a number");
        }

        String str1 = args[0];
        String str2 = args[1];

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("Product of two numbers is " + (num1*num2));
    }
}
