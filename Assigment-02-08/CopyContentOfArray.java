import java.util.Arrays;

public class CopyContentOfArray {
    // Wap to copy content from one array to another array counter clockwise without
    // in-built function

    public static void copyCounterClockwise(int[] arr) {
        int i=0,j=arr.length-1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };

         copyCounterClockwise(array);

        System.out.println("Array: " + Arrays.toString(array));
    
    }
}
