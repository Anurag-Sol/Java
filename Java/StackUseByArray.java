import java.util.*;
// import java.util.Stack;
// import java.util.Scanner;
public class StackUseByArray {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        StackUsingArray stack = new StackUsingArray(1);
        // Stack<Integer> stack = new Stack<>();

        // int[] arr = {2,5,7,2,0,8};
        int[] arr = new int[arrSize];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        while(! stack.isEmpty()){
            System.out.println(stack.pop());
        }

    //     System.out.println(stack.top());
    //     System.out.println( stack.size());
    //     stack.pop();
    //    System.out.println(stack.isEmpty()); 
    }
} 
