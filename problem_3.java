package ARRAY;
import java.util.*;
public class problem_3 {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,30,40,20};
        Arrays.sort(arr);
        System.out.println("Unique Elements : ");
        for(int i=0;i<arr.length;i++){
            if(i==0|| arr[i] !=arr[i-1]){
                System.out.println(arr[i]+ " ");
            }
        }
    }
}
