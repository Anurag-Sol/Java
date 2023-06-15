import java.util.*;
public class HashMapUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc", 1);
        map.put("def", 3);

        map.put("abc", 4);

        System.out.println(map.isEmpty());
        System.out.println(map.size());

        if(map.containsValue(1)){
            System.out.println("Map has value 1");
        }
        
        // map.replace("abc", 1, 5);

        if(map.containsKey("abc")){
            System.out.println("Map has abc");
        }
        if(map.containsKey("abc1")){
            System.out.println("Map has abc1");
        }

        int x = map.get("abc");
        System.out.println(x);

        int y = 0;
        if(map.containsKey("abc1")){
            y = map.get("abc1");
        }
        System.out.println(y);

        // map.remove("abc");
        // if(map.containsKey("abc")){
        //     System.out.println("Map has abc");
        // }

        Set<String> keys = map.keySet();
        for(String s:keys){
            System.out.println(s);
        }
    }
}
