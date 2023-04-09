import java.util.Scanner;
public class CheckSorted {
    public static boolean checkSorted(int[] input) {
        if(input.length <= 1){
            return true;
        }
        int[] smallInput = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            smallInput[i - 1] = input[i];
        }
        boolean ans = checkSorted(smallInput);
        if(!ans){
            return false;
        }
        if(input[0] <= input[1]){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean checkSorted_2(int[] input) {
        if(input.length <= 1){
            return true;
        }
        if(input[0] > input[1]){
            return false;
        }
        int[] smallInput = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            smallInput[i - 1] = input[i];
        }
        boolean ans = checkSorted_2(smallInput);
        return ans;
    }
    private static boolean checkSortedBetter(int[] input, int startIndex) {
        if(startIndex >= input.length - 1){
            return true;
        }
        if(input[startIndex] > input[startIndex + 1]){
            return false;
        }
        boolean ans = checkSortedBetter(input, startIndex + 1);
        return ans;
    }
    public static boolean checkSortedBetter(int[] input){
        return checkSortedBetter(input, 0);
    }
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }  
        return arr;
    }
    public static void main(String[] args) {
        int[] input = takeInput();
        boolean x = checkSorted(input);
        System.out.println(x);
        System.out.println(checkSorted_2(input));
        System.out.println(checkSortedBetter(input));
    }
}
