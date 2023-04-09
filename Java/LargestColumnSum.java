import java.util.Scanner;
public class LargestColumnSum {
    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element at " + i + " row " + j + " column");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static int largestCol(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;
        for(int j=0;j<cols;j++){
            int Sum=0;
            for(int i=0;i<rows;i++){
                Sum = Sum + arr[i][j];
            }
            if(Sum>largest){
                largest = Sum;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[][] arr = takeInput();
        int largColSum = largestCol(arr);
        System.out.println(largColSum);
    }
}
