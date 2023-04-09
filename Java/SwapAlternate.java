import java.util.*;
public class SwapAlternate {

    public static int[] swapAlternate(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        swapAlternate(arr);
        printArray(arr);
    }
}
