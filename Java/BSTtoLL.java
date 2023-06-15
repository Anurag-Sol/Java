import java.util.*;
public class BSTtoLL {
    public static Scanner sc = new Scanner(System.in);
    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if(isRoot){
            System.out.print("Enter root data: ");
        }
        else{
            if(isLeft){
                System.out.print("Enter left child of " + parentData + ": ");
            }
            else{
                System.out.print("Enter the right child of " + parentData + ": ");
            }
        }
        int rootData = sc.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
    public static Node<Integer> bstToLL(BinaryTreeNode<Integer> root) {
        Node<Integer> head = new Node<>(root.data);
        return head;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
    }
}
