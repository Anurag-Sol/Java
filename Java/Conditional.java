import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You can vote");
            } else {
                System.out.println("You can't vote");
            }
        }
    }
}
