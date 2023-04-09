import java.util.*;
public class AllPairs {
    public static void printAllPairs(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.println(extracted(arr, i, j));
                        //   OR
                // System.out.println("("+ arr[i] + "," + arr[j] + ")");
            }
        }
    }

    private static String extracted(int[] arr, int i, int j) {
        return "("+ arr[i] + "," + arr[j] + ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }
        printAllPairs(arr);
    }
}
