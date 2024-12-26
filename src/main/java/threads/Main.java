package threads;

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
