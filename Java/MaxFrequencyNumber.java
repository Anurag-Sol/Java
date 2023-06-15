import java.util.*;
public class MaxFrequencyNumber {
    public static Scanner sc = new Scanner(System.in);
    public static int maxFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            // if(map.containsKey(i)){
            //     map.put(i, map.get(i) + 1);
            // }
            // else{
            //     map.put(i, 1);
            // }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        int ans = Integer.MIN_VALUE;
        for(int i:arr){
            if(map.get(i) > max){
                max = map.get(i);
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int x = maxFrequencyNumber(arr);
        System.out.println(x);
    }
}
