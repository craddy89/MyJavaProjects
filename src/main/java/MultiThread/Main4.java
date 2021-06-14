package MultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        new Worker().main();
    }
}
class Worker {
    Random random = new Random();

    final Object lock1 = new Object();
    final Object lock2 = new Object();

    private final List<Integer> list1 = new ArrayList<>();
    private final List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list1.add(random.nextInt(100));
            }
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list2.add(random.nextInt(100));
            }
        }
    }

    public void work() {
        addToList1();
        addToList2();
    }

    public void main() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(this::work);
        Thread thread2 = new Thread(this::work);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println("Program took: " + (after - before) + " ms to run");
        System.out.println("List1 size: " + list1.size());
        System.out.println("List2 size: " + list2.size());
    }
}
