public class BST {

    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
        if(node == null){
            return false;
        }
        if(node.data == x){
            return true;
        }
        if(x < node.data){
            return isPresentHelper(node.left, x);
        }
        else{
            return isPresentHelper(node.right, x);
        }
    }
    public boolean isPresent(int x) {
        return isPresentHelper(root, x);
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x) {
        if(node == null){
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(x);
            return newNode;
        }
        if(node.data >= x){
            node.left = insertHelper(node.left, x);
        }
        else{
            node.right = insertHelper(node.right, x);
        }
        return node;
    }
    public void insert(int x) {
        root = insertHelper(root, x);
        size++;
    }
    
    private static int maximum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
    public static int minimum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
        if(root == null){
            return new BSTDeleteReturn(null, false);
        }
        if(root.data < x){
            BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }
        if(root.data > x){
            BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
            root.left = outputLeft.root;
            outputLeft.root = root;
            return outputLeft;
        }
        if(root.left == null && root.right == null){
            return new BSTDeleteReturn(null, true);
        }
        if(root.left != null && root.right == null){
            return new BSTDeleteReturn(root.left, true);
        }
        if(root.left == null && root.right != null){
            return new BSTDeleteReturn(root.right, true);
        }

        int rightMin = minimum(root.right);
        root.data = rightMin;
        BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMin);
        root.right = outputRight.root;
        return new BSTDeleteReturn(root, true);

        // int leftMax = maximum(root.right);
        // root.data = leftMax;
        // BSTDeleteReturn outputRight = deleteDataHelper(root.right, leftMax);
        // root.right = outputRight.root;
        // return new BSTDeleteReturn(root, true);
    }
    public boolean deleteData(int x) {
        BSTDeleteReturn output = deleteDataHelper(root, x);
        root = output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }

    public int size() {
        return size;
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node) {
        if(node == null){
            return;
        }
        System.out.print(node.data + ": ");
        if(node.left != null){
            System.out.print("L" + node.left.data + ", ");
        }
        if(node.right!= null){
            System.out.print("R" + node.right.data);
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
    public void printTree() {
        printTreeHelper(root);
    }
}
