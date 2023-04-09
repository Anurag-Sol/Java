import java.util.*;
public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i;j<arr.length;j++){
                if(min > arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }                                    
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        printArray(arr);
    }
}
