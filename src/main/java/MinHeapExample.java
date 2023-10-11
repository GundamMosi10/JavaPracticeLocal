import java.util.PriorityQueue;

public class MinHeapExample{
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(7);
        minHeap.add(1);

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
