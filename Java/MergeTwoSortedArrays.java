import java.util.*;
public class MergeTwoSortedArrays {
    public static int[] mergeArrays(int[] arr1,int[] arr2) {
        int i=0,j=0,k=0;
        int [] arr3 = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                k+=1;
                i+=1;
            }
            else{
                arr3[k] = arr2[j];
                k+=1;
                j+=1;
            }
        }       
        while(i < arr1.length){
            arr3[k] = arr1[i];
            k = k+1;
            i = i+1;
        }
        while(j < arr2.length){
            arr3[k] = arr2[j];
            k = k+1;
            j = j+1;
        }
        return arr3;
    }
    public static void printArray(int[] arr3) {
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Ist array: ");
        int a = sc.nextInt();
        System.out.print("Enter the size of IInd array: ");
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
        int[] arr3 = mergeArrays(arr1,arr2);
        printArray(arr3);
    }
}

