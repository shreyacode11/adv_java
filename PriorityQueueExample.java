import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Top element (peek): " + pq.peek());

        System.out.println("Polling (removing): " + pq.poll());
        System.out.println("After poll: " + pq);
    }
}