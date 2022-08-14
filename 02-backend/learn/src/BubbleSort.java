import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,3};

        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
            for(int j = 1; j < arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.println(Arrays.toString(arr));

        }
    }
}
