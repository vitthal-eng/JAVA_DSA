package ARRAY;
public class problem_1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i] > max){
                min = arr[i];
            }
        }
        System.out.println("max number is : "+max);
        System.out.println("min num is : "+ min);

    }
}
