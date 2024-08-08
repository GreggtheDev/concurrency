package org.example;

public class Consumer implements Runnable {
    private final SharedBuffer buffer; // Shared buffer reference
    private int sum = 0; // Sum of consumed values

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = buffer.remove(); // Remove number from buffer
                sum += value; // Add to sum
                System.out.println("Consumed: " + value + ", Current Sum: " + sum);
                Thread.sleep(150); // Sleep to simulate time taken to consume
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }
}
