package MultiThread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DLock {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();

        Thread thread1 = new Thread(runner1::firstThread);
        Thread thread2 = new Thread(runner1::secondThread);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runner1.finished();
    }
}

class Runner1 {
    private final Account account1 = new Account();
    private final Account account2 = new Account();


    private void takeLock(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;


        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }

                if (firstLockTaken) {
                    lock1.unlock();
                }

                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void firstThread() {

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            synchronized (account1) {
                synchronized (account2) {
                    Account.transfer(account1, account2, random.nextInt(100));
                }
            }
        }
    }

    public void secondThread() {

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            synchronized (account1) {
                synchronized (account2) {
                    Account.transfer(account2, account1, random.nextInt(100));

                }
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance: " + (account1.getBalance() + account2.getBalance()));

    }
}

class Account {
    private int balance = 10000;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account account1, Account account2, int amount) {
        account1.withdraw(amount);
        account2.deposit(amount);
    }
}
