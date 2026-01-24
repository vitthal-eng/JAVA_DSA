package Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {21,21,23,34,45,45,46};
        int target = 45;
        int low = 0;
        int high = arr.length-1;

        for(int i = 0; i < arr.length; i++){
            int mid = low + ( high - low);

            if(arr[mid] == target){
                System.out.println("Target found at Index : "+ mid);
                return;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
    }
}