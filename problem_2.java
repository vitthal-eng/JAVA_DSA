package ARRAY;
public class problem_2 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,10,20};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("min element is : "+min);
    }
}
