import java.util.*;
public class IntersectionOfArrays {
    public static void printIntersectionOfArrays(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr1){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }
        for(int i:arr2){
            if(map.containsKey(i)){
                int freq = map.get(i);
                if(freq > 0){
                    System.out.print(i + " ");
                    map.put(i, freq - 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        } 
        System.out.print("Enter the size of array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        printIntersectionOfArrays(arr1, arr2);
    }
}
