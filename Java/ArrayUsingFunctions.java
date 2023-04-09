import java.util.*;
public class ArrayUsingFunctions{

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }  
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        printArray(arr);
    }
}