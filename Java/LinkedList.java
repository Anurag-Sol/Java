// import java.util.LinkedList;
public class LinkedList {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        // System.out.println("Print " + head);
        // System.out.println(head.data);
        // System.out.println(head.next);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data);
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        // temp = head;

        // while(head != null){
        //     System.out.print(head.data + " ");
        //     head = head.next;
        // }
        // System.out.println();
    }
    public static void increment(Node<Integer> head) {
        // head.data++;
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
        increment(head);
        print(head);
    }
}
