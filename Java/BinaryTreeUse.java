import java.util.*;
import java.util.LinkedList;

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
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        System.out.print("Enter root data: ");
        int rootData = sc.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);
        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of " + front.data);
            int left = sc.nextInt();
            if(left != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter right child of " + front.data);
            int right = sc.nextInt();
            if(right != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
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
    public static void postOrderPrint(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        if(root.left != null){
            postOrderPrint(root.left);
            // System.out.print("L" + root.left.data + ", ");
        }
        if(root.right != null){
            postOrderPrint(root.right);
            // System.out.print("R" + root.right.data);
        }
        // System.out.println();
        System.out.println(root.data);
    }
    public static void inOrderPrint(BinaryTreeNode<Integer> root) {
        // if(root == null){
        //     return;
        // }
        // if(root.left != null){
        //     inOrderPrint(root.left);
        // }
        // System.out.println(root.data);
        // if(root.right != null){
        //     inOrderPrint(root.right);
        // }
        if(root != null){
            inOrderPrint(root.left);
            System.out.println(root.data);
            inOrderPrint(root.right);
        }
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
    public static int largestNode(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }
    public static int heightTree(BinaryTreeNode<Integer> root) {
        if(root == null){
            return  0;
        }
        return Math.max(heightTree(root.left), heightTree(root.right)) + 1;
    }
    public static int numLeaves(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return numLeaves(root.left) + numLeaves(root.right);
    }
    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.println(root.data);
            return;
        }
        printAtDepthK(root.left, k - 1);
        printAtDepthK(root.right, k - 1);
    }
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
    // public static BinaryTreeNode<Integer> invertTree(BinaryTreeNode<Integer> root) {
    //     if(root == null){
    //         return root;
    //     }
    //     BinaryTreeNode<Integer> left=  invertTree(root.left);
    //     BinaryTreeNode<Integer> right =  invertTree(root.right);
    //     root.left = right;
    //     root.right = left;
    //     return root;       
    // }
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;;
        root.right = temp;     
    }
    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if(root == null){
            return true;
        }
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }
    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
        if(root == null){
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }

        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);

        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height - rightOutput.height) > 1){
            isBal = false;
        }

        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;

        return ans;
    }
    public static int diameterOfTree(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int option1 = heightTree(root.left) + heightTree(root.right);
        int option2 = diameterOfTree(root.left);
        int option3 = diameterOfTree(root.right);
        return Math.max(option1, Math.max(option2, option3));
    }
    public static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer> root, int data) {
        if(root == null){
            return null;
        }
        if(root.data == data){
            return root;
        }
        else if(data < root.data){
            return findNode(root.left, data);
        }
        else{
            return findNode(root.right, data);
        }
    }
    public static boolean searchBST(BinaryTreeNode<Integer> root, int data) {
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        if(root.data > data){
            return searchBST(root.left, data);
        }
        return searchBST(root.right, data);
    }
    public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int K1, int K2) {
        if(root == null){
            return;
        }
        if(root.data >= K1 && root.data <= K2){
            System.out.println(root.data);
        }
        if(root.data > K1){
            printBetweenK1K2(root.left, K1, K2);
        }
        if(root.data <= K2){
            printBetweenK1K2(root.right, K1, K2);
        }
    }
    public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr) {
        return sortedArrayToBinaryTreeNode(arr, 0, arr.length - 1);
    }
    private static BinaryTreeNode<Integer> sortedArrayToBinaryTreeNode(int[] arr, int start, int end) {
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = sortedArrayToBinaryTreeNode(arr, start, mid - 1);
        root.right = sortedArrayToBinaryTreeNode(arr, mid + 1, end);
        return root;
    }

    public static int maximum(BinaryTreeNode<Integer> root) {
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
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if(root == null){
            return true;
        }
        int leftMax = maximum(root.left);
        if(leftMax >= root.data){
            return false;
        }
        int rightMin = minimum(root.right);
        if(rightMin < root.data){
            return false;
        }
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        return isLeftBST && isRightBST;
    }
    
    public static boolean isBST2(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
        if(root == null){
            return false;
        }
        if(root.data < minRange || root.data > maxRange){
            return true;
        }
        boolean isLeftWithinRange = isBST2(root.left, minRange, root.data - 1);
        boolean isRightWithinRange = isBST2(root.right, root.data, maxRange);
        return isLeftWithinRange && isRightWithinRange;
    }
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x) {
        if(root == null){
            return null;
        }
        if(root.data == x){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
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
        // BinaryTreeNode<Integer> root = takeInputLevelWise();
        
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
        // System.out.println("No. of Nodes: " + numNodes(root));
        // System.out.println("Sum of Nodes: " + sumNodes(root));
        printTreeDetailed(root);
        // postOrderPrint(root);
        // inOrderPrint(root);
        // System.out.println("Largest : " + largestNode(root)); 
        // System.out.println("Height : " + heightTree(root));
        // System.out.println("Total Leaves : " + numLeaves(root));
        // printAtDepthK(root, 1);
        // BinaryTreeNode<Integer> newRoot = removeLeaves(root);
        // printTreeDetailed(newRoot);
        // BinaryTreeNode<Integer> newRoot1 = invertTree(root);
        // printTreeDetailed(newRoot1);
        // mirrorBinaryTree(root);
        // printTreeDetailed(root);
        // System.out.println("Is Balanced : " + isBalanced(root));
        // System.out.println("Is Balanced Better : " + isBalancedBetter(root).isBalanced );
        // System.out.println("Is Height : " + isBalancedBetter(root).height );
        // System.out.println("Diameter : " + diameterOfTree(root));
        // System.out.println(findNode(root, 5).data);
        // System.out.println(searchBST(root, 5));
        // printBetweenK1K2(root, 2, 6 );
        // int[] arr = {1,2,3,4,5,6,7};    
        // printTreeDetailed(sortedArrayToBST(arr));   
        // System.out.println(isBST(root));
        // System.out.println(isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        // ArrayList<Integer> path = nodeToRootPath(root, 5);
        // if(path == null){
        //     System.out.println("Not Found");
        // }
        // else{
        //     for(int i : path){
        //         System.out.println(i);
        //     }
        // }

        
    } 
}
