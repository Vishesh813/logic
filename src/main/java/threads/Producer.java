package threads;

public class Producer extends Thread {
    private final SharedBuffer buffer;


    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                Thread.sleep(5000); // Simulate time taken to produce an item
                buffer.produce(value++);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
