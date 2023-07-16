import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 6, 3};

        heapSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n/2-1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
//The above code demonstrates the implementation of the heap sort algorithm in Java. Heap sort
// is a comparison based algorithm that uses the binary heap data structure to sort elements.
// It involves building a max heap from the array and repeatedly extracting the maximum element
// from the heap to obtain a sorted array.
