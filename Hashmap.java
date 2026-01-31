import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println(map.isEmpty());
        map.put("India", 120);
        map.put("china", 150);
        map.put("US", 50);

        System.out.println(map);

        // map.put("china", 140);
        // System.out.println(map); 
        
        // // search
        // if(map.containsKey("India")){
        //     System.out.println("Key contain ");
        // }
        // else{
        //     System.out.println("does not cotain");
        // }

        // System.out.println(map.get("India"));
        // System.out.println(map.get("india"));

        // iterate
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Set<String> keys = map.keySet();
        // for(String key : keys){
        //     System.out.println(key + " "+ map.get(key));
        // }

        map.remove("US");
        System.out.println(map);
    }
}
