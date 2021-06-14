package MultiThread;

public class Main1 {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello form main thread!");
    }

}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i =0; i < 10; i++) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello!" + i);
        }
    }
}

//    class MyThread extends Thread {
//     public void run() {
//         for (int i =0; i < 10; i++) {
//             try {
//                 Thread.sleep(2500);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             System.out.println("Hello!" + i);
//         }
//     }
//    }