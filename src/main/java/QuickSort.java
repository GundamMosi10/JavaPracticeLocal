import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 6, 3};
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);//partition the array

            quickSort(arr, low, pivotIndex - 1); //Sort the left sub-array
            quickSort(arr, pivotIndex + 1, high); //Sort the right sub-array
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//Quick sort has an average time complexity of 0(n log n) and performs efficiently on average
// for a wide range of input data. However, in the worst-case scenario(eg. already sorted or
// reverse sorted array), the time complexity can degrade to 0(n^2).