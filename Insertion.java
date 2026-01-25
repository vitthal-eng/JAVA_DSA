package Sorting;

import java.util.Arrays;

public class Insertion {
    
    public static void main(String[] args) {
        int[] arr = {23,1,10,5,2};
        int n = arr.length;
        
        // for( int i = 1; i<n; i++){
        //     int sorted = arr[i];
        //     int j = i-1;
        //     while(j >= 0 && arr[j] > sorted){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = sorted;
        // }

        for(int i = 1; i<n; i++){
            int sorted = i;

            for(int j = i-1; j >= 0; j--){
                if(arr[j] > arr[sorted]  ){
                    int temp = arr[sorted];
                    arr[sorted] = arr[j];
                    arr[j] = temp;

                    sorted = j ;
                    
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
