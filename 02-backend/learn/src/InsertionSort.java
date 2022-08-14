import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,7};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }

}
