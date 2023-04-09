import java.util.*;
class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;
    DoubleNode(Node<Integer> head, Node<Integer> tail){
        this.head = head;
        this.tail = tail;
    }
    public DoubleNode() {

    }
}
public class LinkedListUse {
    public static Node<Integer> head = null, tail = null;
    static Scanner sc = new Scanner(System.in);
    public static Node<Integer> takeInput() {
        int data = sc.nextInt();
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
    public static Node<Integer> addFirst(int data) {
        Node<Integer> newNode = new Node<>(data);
        // if(head == null){
        //     head = newNode;
        //     return;
        // }
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static int length(Node<Integer> head) {
        Node<Integer> temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void printR(Node<Integer> head) {
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printR(head.next);
    }
    public static Node<Integer> insertR(Node<Integer> head, int elem, int pos) {
        if(head == null && pos > 0){
            return head;
        }
        if(pos == 0){
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            return newNode;
        }
        else{
            // Node<Integer> smallerHead = insertR(head.next, elem, pos - 1);
            // head.next = smallerHead;
            head.next = insertR(head.next, elem, pos - 1);
            return head;
        }
    }
    public static Node<Integer> deleteR(Node<Integer> head, int pos) {
        if(head == null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
        // Node<Integer> smallHead = deleteR(head.next, pos - 1);
        // head.next = smallHead;
        head.next = deleteR(head.next, pos - 1);
        return head;
    }
    public static void reversePrint(Node<Integer> head) {
        if(head == null){
            return;
        }
        reverseR(head.next);
        System.out.print(head.data + " ");
    }
    public static Node<Integer> reverseR(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> smallHead = reverseR(head.next);
        Node<Integer> tail = smallHead;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return smallHead;
    }
    public static DoubleNode reverseRBetter(Node<Integer> head) {
        DoubleNode ans;
        if(head == null || head.next == null){
            // ans = new DoubleNode();
            ans = new DoubleNode(head, head);
            // ans.head = head;
            // ans.tail = tail;
            return ans; 
        }
        DoubleNode smallAns = reverseRBetter(head.next);
        smallAns.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }
    public static Node<Integer> reverseRBetter1(Node<Integer> head){
        DoubleNode ans = reverseRBetter(head);
        return ans.head;
    }
    public static Node<Integer> reverseRMoreBetter(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> prev = null;
        Node<Integer> smallHead = reverseRMoreBetter(head.next);
        head.next.next = head;
        head.next=prev;
        return smallHead;
    }
    public static Node<Integer> midpoint(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        // increment(head);
        // head= addFirst(sc.nextInt());
        // head = insertR(head, 20, 4);
        // head = deleteR(head, 2);
        // reversePrint(head);
        // // head = reverseR(head);
        // // DoubleNode ans = reverseRBetter(head);
        // // printR(ans.head);
        // head = reverseRBetter1(head);
        // head = reverseRMoreBetter(head);
        Node<Integer> mid = midpoint(head);
        System.out.println(mid.data);
        // print(head);
        // printR(head);
        // System.out.println(length(head));
    }
}
