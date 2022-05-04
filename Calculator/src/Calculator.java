import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Welcome to the Java Calculator!");
        System.out.println("Please enter a number, then the desired operation and then one more number");
        Scanner sc = new Scanner(System.in);
        Double firstNumber = sc.nextDouble();
        String operation = sc.next();
        Double secondNumber = sc.nextDouble();

        System.out.println(firstNumber);
        System.out.println(operation);

        if (operation == "/"){
            System.out.println(firstNumber);

            System.out.println(firstNumber / secondNumber);
        }



    }
}
