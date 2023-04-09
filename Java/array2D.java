import java.util.Scanner;
public class array2D {
    public static void printArray(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println("Enter the element at " + i + " row " + j + " column");
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);
        // System.out.println(arr.length);    //It gives no. of rows
        // System.out.println(arr[0].length);  //It goves no. of columns
    }
}
