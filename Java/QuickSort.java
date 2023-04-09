import java.util.Scanner;
public class QuickSort {
    public static int partition(int[] arr,int startIndex,int endIndex) {
        int pivot = arr[startIndex];
        int count = 0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = startIndex + count;
        arr[startIndex] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i = startIndex, j = endIndex;
        while(i<j){
            while(i<=endIndex && arr[i] <= pivot){
                i++;
            }while(arr[j] > pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr,int startIndex,int endIndex) {
        if(startIndex >= endIndex){
            return;
        }
        int partitionIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, partitionIndex-1);
        quickSort(arr, partitionIndex+1, endIndex);
    }
    public static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length);
    }
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int startIndex = 0;
        int endIndex = arr.length - 1;
        quickSort(arr,startIndex,endIndex);
        printArray(arr);
    }
}