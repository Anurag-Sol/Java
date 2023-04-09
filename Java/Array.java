import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                                  /////////////////////////
        // int arr[] = new int[10];
                // OR
        // int[] arr = new int[10];
        // arr[0]=5;
        // arr[7]=10;
        // System.out.println(arr[7]);
        // System.out.println(arr[6]);


                                    ////////////////////////
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        //     // System.out.println(arr[i]);  
        // }    
        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }
                  
        
                                                        /////////////////  Array Sum //////////
        int n = sc.nextInt();  
        int Sum = 0;                                
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            Sum=Sum+arr[i];
        }
        System.out.println(Sum);
    }
}
