import java.util.*;
public class InsertNode {
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode;
            }
            else{
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head; 
    }
    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        int currPos = 0;
        Node<Integer> newNode = new Node<>(data);
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> temp = head;
        while(temp != null && currPos < (pos - 1)){
            temp = temp.next;
            currPos++;
        }
        if(temp == null){
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;

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
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput();
        int pos = sc.nextInt();
        int data = sc.nextInt();
        insert(head,pos,data);
        print(head);
    }
}
