package unit2;

class Buffer {
    private int data;
    private boolean isEmpty = true; // buffer initially empty

    // producer produces an item
    public synchronized void produce(int value) {
        while (!isEmpty) { // wait until the buffer is empty
            try {
                wait();  // release lock and wait for consumer
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = value;
        System.out.println("Producer produced: " + value);
        isEmpty = false;
        notify(); // wake up one waiting consumer
    }

    // consumer consumes an item
    public synchronized void consume() {
        while (isEmpty) { // wait until there is data
            try {
                wait(); // release lock and wait for producer
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer consumed: " + data);
        isEmpty = true;
        notify(); // wake up one waiting producer
    }
}

class Producer extends Thread {
    private Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {}
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

