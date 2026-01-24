package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 23,12,54,7,45};

        int target = 45;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == target) {
                System.out.println("Targe found At Index : " + i);
            }
        }
    }
}
