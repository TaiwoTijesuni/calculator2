import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
        int num1, num2;
    Scanner obj = new Scanner(System.in);
    System.out.println("first number: ");
    // input for the first number.
     num1 = obj.nextInt();

    System.out.println("second number: ");
    //input for the second number.
     num2 = obj.nextInt();

    System.out.println("input an operator (+, -, *, /): ");
    //input for operators.
   char operator = obj.next().charAt(0);
   
    switch(operator){
        case '+':
            System.out.println(num1 + num2);
            break;
        case '-':
            System.out.println(num1 - num2);
            break;
        case'*':
            System.out.println(num1 * num2);
            break;
        case'/':
            System.out.println(num1 / num2);
            break;
        default:
            System.out.println("Invalid operator");

    }

    }
}