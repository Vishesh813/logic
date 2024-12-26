package threads;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
            System.out.println("Producer is waiting because data is full..."+buffer.size());
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // Notify consumers that new data is available
        System.out.println("Consumers notified");
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait until there is data in the buffer
            System.out.println("Consumer waiting to get retrieve data from producer...");
        }
        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notifyAll(); // Notify producers that buffer has space
        System.out.println("Producers notified");
    }
}
