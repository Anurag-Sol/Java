import java.util.*;
public class BinaryTreeUse {
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
    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.print("Enter root data: ");
        int rootData = sc.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        System.out.println("Enter " + root.data + " Left Child: ");
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        System.out.println("Enter " + root.data + " Right Child: ");
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + ": ");
        if(root.left != null){
            System.out.print("L" + root.left.data + ", ");
        }
        if(root.right!= null){
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
    public static int numNodes(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int nodeLeftCount = numNodes(root.left);
        int nodeRightCount = numNodes(root.right);
        return 1 + nodeLeftCount + nodeRightCount;
    }
    public static int sumNodes(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int nodeLeftSum = sumNodes(root.left);
        int nodeRightSum = sumNodes(root.right);
        return root.data + nodeLeftSum + nodeRightSum;
    }
    public static void printTree(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
        // if(root.left != null){
        //     printTree(root.left);
        // }
        // if(root.right != null){
        //     printTree(root.right);
        // }
    }
    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = takeTreeInput();
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);

        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        // root.left = rootLeft;
        // root.right = rootRight;

        // BinaryTreeNode<Integer> twoLeft = new BinaryTreeNode<>(4);
        // BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(5);
        // BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(6);
        // rootLeft.left = twoLeft;
        // rootLeft.right = twoRight;
        // rootRight.left = threeLeft;
        System.out.println("No. of Nodes: " + numNodes(root));
        System.out.println("Sum of Nodes: " + sumNodes(root));
        // printTreeDetailed(root);
    }
}
