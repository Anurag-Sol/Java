import java.util.Scanner;
public class fact {
    // int n;
    public static int factorial(int n) {
        if(n == 0){
            return 1;
        }
        // int ans = factorial(n-1);
        return n * factorial(n-1);
    }
    // fact(int n){
    //     n = n*n;
    //     this.n = n;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);
    }
}
