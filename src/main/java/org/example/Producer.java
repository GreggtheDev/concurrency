package org.example;

import java.util.Random;

public class Producer implements Runnable {
    private final SharedBuffer buffer; // Shared buffer reference

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                int value = random.nextInt(100); // Generate random number
                buffer.add(value); // Add number to buffer
                System.out.println("Produced: " + value);
                Thread.sleep(100); // Sleep to simulate time taken to produce
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }
}
