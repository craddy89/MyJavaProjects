package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Smphore {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(connection::work);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Connection {
    private static final Connection connection = new Connection();
    private int connectionsCount;
    private final Semaphore semaphore = new Semaphore(10);

    private Connection() {

    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            doWork();
        } finally {
            semaphore.release();
        }

    }

    private void doWork() {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        try {
            Thread.sleep(5000);

            synchronized (this) {
                connectionsCount--;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


