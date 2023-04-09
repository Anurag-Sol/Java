public class StackUseByLL {
    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        stack.push(10);
        stack.push(15);
        while(! stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
