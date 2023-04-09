import java.util.*;
public class Pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks: ");
        float x = sc.nextFloat();
        System.out.println("Enter the marks of 1st subject");
        float a = sc.nextFloat();
        float percentage1 = ((a/x)*100);
        System.out.println(percentage1);
        System.out.println("Enter the marks of 2ndsubject");
        float b = sc.nextFloat();
        float percentage2 = ((b/x)*100);
        System.out.println(percentage2);
        System.out.println("Enter the marks of 3rd subject");
        float c = sc.nextFloat();
        float percentage3 = ((c/x)*100);
        System.out.println(percentage3);
        System.out.println("Enter the marks of 4th subject");
        float d = sc.nextFloat();
        float percentage4 = ((d/x)*100);
        System.out.println(percentage4);
        System.out.println("Enter the marks of 5th subject");
        float e = sc.nextFloat();
        float percentage5 = ((e/x)*100);
        System.out.println(percentage5);
    }
}
