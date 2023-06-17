import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 6, 3};

        insertionSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; j--;
            }
            arr[j + 1] = key;
        }
    }
}
