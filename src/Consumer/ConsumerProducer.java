package Consumer;

import java.util.LinkedList;
import java.util.Queue;

public class ConsumerProducer {
    int capacity;
    Queue<Integer> storage = new LinkedList<>();
    public ConsumerProducer(int capacity){
        this.capacity = capacity;
    }
    public synchronized void producer(int value) throws InterruptedException{
        if(storage.size() == capacity){
            wait();
        }
        storage.add(value);
        System.out.println("Produced" + value);
        notify();
    }
    public synchronized int consumer() throws InterruptedException{
        if(storage.isEmpty()){
            wait();
        }
        int value= storage.poll();
        System.out.println("consumed"+value);
        return value;
    }
}
