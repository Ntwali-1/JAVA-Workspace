package lambda;

//class Girl extends Thread {
//    @Override
//    public void run() {
//        for(int i = 0; i < 10; i++){
//            System.out.println("Girl");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//
//}
//
//class Boy extends Thread {
//    @Override
//    public void run() {
//        for(int i = 0; i < 10; i++){
//            System.out.println("Boy");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class CalculatorMain {
    public static void main(String[] args) {
        //Lambda expression
        Calculator calc = (int a, int b) -> a + b;
        System.out.println(calc.calculate(1, 2));

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

        //MultiThreading
        Thread t1 = new Thread(girl);
        Thread t2 = new Thread(boy);
        t1.start();
        t2.start();
    }
}
