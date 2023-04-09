import java.util.Scanner;
public class Power {
    public static int power(int n,int N) {
        if(N == 0){
            return 1;
        }
        // if(n == 0){
        //     return 1;
        // }
        return n * power(n,N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = sc.nextInt();
        int x = power(n,N);
        System.out.println(x);
    }
}
