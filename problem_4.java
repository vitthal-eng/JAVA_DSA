package ARRAY;
public class problem_4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,7,9};
        int even=0;
        int odd=0;

        for(int i:arr){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even : "+even+" , odd : " +odd);
    }
}
