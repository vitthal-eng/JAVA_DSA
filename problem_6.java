package ARRAY;
import java.util.Scanner;
public class problem_6 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);

        System.out.print("enter element to search :");
        int e=sc.nextInt();

        for (int i=0;i<arr.length;i++){
            if(e ==arr[i]){
                System.out.println(e+" is present in array");
                break;
            }
            else{
                System.out.println("not Exists..!!");
                break;
            }
        }
    }
}
