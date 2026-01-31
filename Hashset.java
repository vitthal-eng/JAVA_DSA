import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

    public static void main(String[] args) {
        // duplicate cant allowed
        // creation:
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(3);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(4);
        // System.out.println(set);

        // // search
        // if(set.contains(3)){
        //     System.out.println("Set containss 3");
        // }
        // if(set.contains(9)){
        //     System.out.println("Does not Contain");
        // }

        // // delete
        // set.remove(3);
        // System.out.println(set);
        // System.out.println(set.contains(3)+ " does not Cotain");
        // System.out.println(set.size());

        // iterator
        Iterator it = set.iterator();

        // hasNext function
        // next function
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }   
}
