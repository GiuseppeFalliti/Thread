import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class MainThread extends Thread {
    private static final int NUM = 25;
    private int count = 0;
    private final CountDownLatch startSignal;
    private int[][] matrix;

    public MainThread(CountDownLatch startSignal, int[][] matrix) {
        this.startSignal = startSignal;
        this.matrix = matrix;
    }

    public static void main(String[] args) {

        CountDownLatch startSignal = new CountDownLatch(1);

        int[][] matrix = RandomMatrix();

        Thread t1 = new Thread(new MainThread(startSignal, matrix));
        Thread t2 = new Thread(new MainThread(startSignal, matrix));
        Thread t3 = new Thread(new MainThread(startSignal, matrix));

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();

        startSignal.countDown(); // il countdown viene decrementato di 1 va a 0 e il MainThread fa partire tutti
                                 // i thread.

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread finiti.");
    }

    @Override
    public void run() {
        try {
            startSignal.await(); // aspetta lo segnare di start
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == NUM) {
                    count++;
                }
            }
        }

        System.out.println(Thread.currentThread().getName() + " :conta:" + count + " numero:" + NUM);
    }

    private static int[][] RandomMatrix() {
        int[][] matrix = new int[40][40];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
            }
        }
        return matrix;
    }

}
