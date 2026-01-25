package Sorting;

import java.util.Arrays;

public class BubbkeSort {

    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {34,23,45,12,11};

        for(int i = 0; i<arr.length -1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // System.out.println(Arrays.toString(arr));
        printArray(arr);
    }
}
