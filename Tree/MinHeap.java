import java.util.PriorityQueue;

class MinHeap{
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        minheap.add(10);
        minheap.add(20);
        minheap.add(5);
        
        minheap.add(15);

        System.out.println("Min element = " + minheap.element());
        }
    }