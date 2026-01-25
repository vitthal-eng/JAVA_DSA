package Sorting;
public class Selection {
    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
