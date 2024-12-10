import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo extends DataStructure {
    private final Queue<Integer> queue; // Su dung Queue cua Java Collections Framework

    // Khoi tao Queue
    public QueueDemo() {
        this.dataStructure = "Queue";
        this.queue = new LinkedList<>();
    }

    @Override
    public void insert(int value) {
        queue.add(value); // Them phan tu vao cuoi hang doi
        System.out.println("Enqueued " + value + " to the queue.");
    }

    @Override
    public void delete(int value) {
        if (queue.peek() == value) { // Chi xoa neu gia tri dau tien trong hang doi khop
            queue.poll(); // Loai bo phan tu o dau hang doi
            System.out.println("Dequeued " + value + " from the queue.");
        } else {
            System.out.println(value + " is not at the front of the queue. Cannot dequeue.");
        }
    }

    @Override
    public int find(int value) {
        if (queue.contains(value)) {
            System.out.println(value + " is in the queue.");
            return 1; // Tra ve 1 neu tim thay
        } else {
            System.out.println(value + " is not in the queue.");
            return -1; // Tra ve -1 neu khong tim thay
        }
    }

    @Override
    public void showStructure() {
        System.out.println("Queue contents: " + queue);
    }
}
