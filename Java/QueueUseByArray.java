import java.util.Scanner;
public class QueueUseByArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        QueueUsingArray queue = new QueueUsingArray();
        // QueueUsingArray queue = new QueueUsingArray(n);
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // int[] arr = {10,20,30,40,50};
        for(int i = 0; i < arr.length; i++){
            // try {
            //     queue.enqueue(arr[i]);
            // } 
            // catch (QueueFullException e) {
            // }
            queue.enqueue(arr[i]);
        }
        while(! queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } 
            catch (QueueEmptyException e) {
            }
        }
    }
}
