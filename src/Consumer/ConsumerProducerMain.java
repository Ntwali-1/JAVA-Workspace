package Consumer;

public class ConsumerProducerMain {
    public static void main(String[] args){
        ConsumerProducer c = new ConsumerProducer(10);
        Thread t1 = new Thread(
                () -> {
                    for(int i = 1; i<50;i++){
                        try{
                            c.producer(i);
                            Thread.sleep(100);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        };

                    }
                }
        );
        Thread t2 = new Thread(
                () -> {
                    for(int i = 1; i<50;i++){
                        try{
                            c.consumer();
                            Thread.sleep(100);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        };

                    }
                }
        );
        t1.start();
        t2.start();
    }
}
