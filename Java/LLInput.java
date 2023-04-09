import java.util.Scanner;
public class LLInput {
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                // Make this node as head and tail
                head = currentNode;
                tail = currentNode;
            }
            else{
                // Node<Integer> tail = head;
                // while(tail.next != null){
                //     tail = tail.next;
                // }
                // tail.next = currentNode;

                // Second Method and better
                tail.next = currentNode;
                // tail = currentNode;
                // OR
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head; 
    }
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }
}
