import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_01 {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);

       System.out.println(list1);
        
       int ele =  list1.get(3);
       System.out.println(ele);

       list1.add(1,6);
       System.out.println(list1);

       list1.set(0,5);
       System.out.println(list1);

       list1.remove(0);
       System.out.println(list1);
       
       System.out.println(list1.size());

    //    loops on arraylist

    for(int i = 0; i < list1.size(); i++){
        System.out.print(list1.get(i));
    }
    Collections.sort(list1);
    System.out.println(list1);
    }

}
