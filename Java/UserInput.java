import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number: ");
        int firstNumber = sc.nextInt();
        System.out.println(firstNumber);
        System.out.println("Enter the second number: ");
        float secondNumber = sc.nextFloat();
        System.out.println(secondNumber);
        System.out.println("Enter the Name: ");
        String Name = sc.nextLine();
        System.out.println(Name);
    }
    }
}
