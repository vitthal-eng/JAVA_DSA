package ARRAY;

import java.util.Arrays;
import java.util.Scanner;;
public class first{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int [] arr=new int[5];
        // arr[0]=24;
        // arr[1]=12;
        // arr[2]=23; 
        // arr[3]=23; 
        // arr[4]=23; 

        // System.out.println(arr[3]);

        // for (int i=0;i<arr.length;i++){
        //     arr[i]=in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));
        // for (int i=0; i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }
        // for( int num:arr){
        //     System.out.println(num + "  ");
        // }

        String [] str=new String[4];
        for (int i=0;i<str.length;i++){
            str[i]=in.next();

        }
        System.out.println(Arrays.toString(str));

        str[1]="pavan";

        System.out.println(Arrays.toString(str));
        

        }
    }
