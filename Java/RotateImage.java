import java.util.Scanner;
public class RotateImage {
    public static int[][] rotate(int[][] matrix) {
        int N = matrix.length;
        for (int x = 0; x < N / 2; x++) {
            for (int y = 0; y < matrix[0].length; y++){
                int temp = matrix[x][y];
                matrix[x][y] = matrix[N - 1 - x][y];
                matrix[N - 1 - x][y] = temp;
            }
        }
        for (int x = 0; x < matrix.length; x++) {
            for (int y = x+1; y < matrix[0].length; y++){
                int temp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = temp;
            }
        }
        return matrix;
    }
    public static void printArray(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
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
    public static void main(String[] args) {
        int[][] arr = takeInput();
        int[][] m = rotate(arr);
        printArray(m);
    }
}
