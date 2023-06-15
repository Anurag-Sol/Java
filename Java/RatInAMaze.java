import java.util.Scanner;

public class RatInAMaze {
    private static Scanner sc = new Scanner(System.in);
    // public static boolean ratInAMaze(int[][] maze) {
    //     int n = maze.length;
    //     int[][] path = new int[n][n];
    //     return solveMaze(maze, 0, 0, path);
    // }
    public static void ratInAMaze(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        printAllPaths(maze, 0, 0, path);
    }
    public static void printAllPaths(int maze[][], int i, int j, int path[][]) {
        int n = maze.length;
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return;
        }
        path[i][j] = 1;
        if(i == n - 1 && j == n - 1){
            for(int r = 0; r < n; r++){
                for(int c = 0; c < n; c++){
                    System.out.print(path[r][c] + " ");             
                }
                System.out.println();
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }
        printAllPaths(maze, i - 1, j, path);
        printAllPaths(maze, i, j + 1, path);
        printAllPaths(maze, i + 1, j, path);
        printAllPaths(maze, i, j - 1, path);
        path[i][j] = 0;
    }
    public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
        int n = maze.length;
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }
        // Include the cell in current path
        path[i][j] = 1;
        // Destination Cell
        if(i == n - 1 && j == n - 1){
            for(int r = 0; r < n; r++){
                for(int c = 0; c < n; c++){
                    System.out.print(path[r][c] + " ");             
                }
                System.out.println();
            }
            return true;
        }
        // Top Direction
        if(solveMaze(maze, i - 1, j, path)){
            return true;
        }
        // Right Direction
        if(solveMaze(maze, i, j + 1, path)){
            return true;
        }
        // Down Direction
        if(solveMaze(maze, i + 1, j, path)){
            return true;
        } 
        // Left Direction
        if(solveMaze(maze, i, j - 1, path)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] maze = new int[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.println("Enter the element at " + i + " row " + j + " column");
                maze[i][j] = sc.nextInt();
            }
        }
        ratInAMaze(maze);
        // boolean pathPossible = ratInAMaze(maze);
        // System.out.println(pathPossible);
    }
}
