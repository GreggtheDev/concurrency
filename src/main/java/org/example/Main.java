package org.example;

import org.example.SharedBuffer;
import org.example.Producer;
import org.example.Consumer;

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(10);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
