import java.util.Arrays;

public class NumberSorter {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3, 38, 29, 7, 17};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}

//In this code we have the original array of numbers.  The Array.sort() method takes that original array of numbers
// and will sort the numbers into ascending order. The sorted array is then displayed using the
// Arrays.toString() method.

//The Arrays.sort() method is a built in method in Java that sorts the elements of an arrayin ascending order
// It uses the Dual-pivot Quicksort algorithm for primitive types(int) and the modified merge sort algorithm
// for reference types like objects.