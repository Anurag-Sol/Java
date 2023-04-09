import java.util.Scanner;
public class JaggedArray {
    public static void printArray(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[i+1];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            System.out.println("Enter the element at " + i + " row " + j + " column");
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);
    }
}