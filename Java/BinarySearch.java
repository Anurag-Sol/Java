import java.util.*;
public class BinarySearch {
    
    public static int[] selectionSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static int binarySearch(int[] arr,int x){
        int start = 0;
        int end = arr.length - 1;
        int mid = start;
        while(start <= end){
            mid = (start+end)/2;
            if(arr[mid] > x){
                end = mid - 1;
            }
            else if(arr[mid]<x){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
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
        System.out.print("Enter the number to find: ");
        int x = sc.nextInt();
        selectionSort(arr);
        // printArray(arr);
        int a = binarySearch(arr,x);
        System.out.println(a);
    }
}
