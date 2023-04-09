import java.util.*;
public class MergeSort {
    public static void merge(int[] arr, int si, int ei) {
        int size = ei - si + 1;
        int mid = (si + ei)/2;
        int[] arr1 = new int[size];
        int i = si, j = mid + 1, k = 0;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                arr1[k] = arr[i];
                i++;
                k++;
            }
            else{
                arr1[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i <= mid){
            arr1[k] = arr[i];
            i++;
            k++;
        }
        while(j <= ei){
            arr1[k] = arr[j];
            j++;
            k++;
        }
        int m = 0;
        for(int l = si; l <= ei; l++){
            arr[l] = arr1[m];
            m++;
        }
    }
    public static void mergeSort(int[] arr, int si, int ei) {
        if(si >= ei){
            return;
        }
        int mid = (si + ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei);
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i < N; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
// import java.util.*;
// public class MergeSort {
//     void merge(int arr[], int l, int m, int r) {
//         int n1 = m + 1;
//         int n2 = r - m; 
//         int L[] = new int[n1];
//         int R[] = new int[n2];
//         for(int i = 0;i < n1;i++)
//         {
//             L[i] = arr[i];
//         }
//         for(int j = 0;j<n2;j++)
//         {
//             R[j] = arr[m + 1 + j];
//         }
//         int i = 0;
//         int j = 0;
//         int k = 0;
//         while(i<n1 && j<n2)
//         {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             } 
//             else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<n1)
//         {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }
//         while(j<n2)
//         {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }
//     void sort(int arr[],int l,int r){
//         if (l >= r){
//             return;
//         }
//         int m = (l + r)/2;
//         sort(arr,l,m);
//         sort(arr,m+1,r);
//         merge(arr,l,m,r);
//     }
//     public static void main (String args[]){
//         int arr[] = {2,4,1,9,5};
//         MergeSort obj = new MergeSort();
//         obj.sort(arr,0,arr.length-1);
//         for(int i =0; i < arr.length; i++){
//             System.out.println(arr[i]+" ");
//         }
//     }
// }
