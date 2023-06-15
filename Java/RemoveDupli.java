import java.util.*;
public class RemoveDupli {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i], true);
        }
        return output;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println(output);
    }
}
