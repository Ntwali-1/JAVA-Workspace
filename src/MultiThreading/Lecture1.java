package MultiThreading;

/*
class Girl extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Girl");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Boy extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Boy");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
*/

class Counter {
    int count = 0;
    public synchronized void increment() {
        count++;
    }
}

public class Lecture1 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable c1 = () -> {
            for (int i = 0; i < 200; i++) {
                counter.increment();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable c2 = () -> {
            for(int i = 0; i < 200; i++){
                counter.increment();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}
