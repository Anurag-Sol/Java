import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }     
    }
}
