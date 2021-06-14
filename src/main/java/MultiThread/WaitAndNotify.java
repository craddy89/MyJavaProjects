package MultiThread;

import java.util.Scanner;

public class WaitAndNotify {
    public static void main(String[] args) {
        WaitAndNotify1 wn1 = new WaitAndNotify1();

        Thread thread1 = new Thread(wn1::produce);
        Thread thread2 = new Thread(wn1::consume);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WaitAndNotify1 {
    public void produce() {
        synchronized (this) {
            System.out.println("Producer thread started...");
            try {
                wait();
                System.out.println("Producer thread resumed...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consume() {
        try {
            Thread.sleep(2000);
            Scanner scanner = new Scanner(System.in);

            synchronized (this) {
                System.out.println("Waiting for return key pressed");
                scanner.nextLine();
                notify();

                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
