package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final int maxSize; // Maximum size of the buffer
    private final Queue<Integer> buffer = new LinkedList<>(); // Queue to hold buffer elements

    public SharedBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    // Synchronized method to add elements to the buffer
    public synchronized void add(int value) throws InterruptedException {
        while (buffer.size() == maxSize) {
            wait(); // Wait if buffer is full
        }
        buffer.add(value);
        notifyAll(); // Notify all waiting threads
    }

    // Synchronized method to remove elements from the buffer
    public synchronized int remove() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait if buffer is empty
        }
        int value = buffer.poll();
        notifyAll(); // Notify all waiting threads
        return value;
    }
}
