import java.util.Arrays;

public class CallByReference {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        modifyArray(arr);
        System.out.println("Modified array: " + Arrays.toString(arr)); // Output: Modified array: [4, 2, 3]
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 4; // Modifying the first element of the array
    }
}


