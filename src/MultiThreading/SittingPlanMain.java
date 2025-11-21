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

public class SittingPlanMain {
    public static void main(String[] args) {

        Runnable girl = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Girl");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable boy = () -> {
            for(int i = 0; i < 10; i++){
                System.out.println("Boy");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(girl);
        Thread t2 = new Thread(boy);
        t1.start();
        t2.start();
    }
}
