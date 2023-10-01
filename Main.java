import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Calculator");
        System.out.println("Calculator");

        System.out.println("Enter add for adding");
        System.out.println("Enter sub for subtracting");
        System.out.println("Enter mul for multiplication");
        System.out.println("Enter div for division");
        System.out.println("Enter exit if you really wanna get out");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if("exit".equals(s)){
            System.out.println("Exiting..");
            return;
        }

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();


        switch(s){
            case "add":
                System.out.println((num1+num2));
                break;
            case "sub":
                System.out.println((num1-num2));
                break;
            case "mul":
                System.out.println((num1*num2));
                break;
            case "div":
                System.out.println((num1/num2));
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}