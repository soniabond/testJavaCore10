package module12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
//        executorService.schedule(
//                new MyTask(),
//                5,
//                TimeUnit.SECONDS
//        );
        executorService.scheduleAtFixedRate(
                () -> System.out.println("Time: " + System.currentTimeMillis()),
                0,
                2,
                TimeUnit.SECONDS
        );
        Thread.sleep(7000);
        executorService.shutdown();
        System.out.println("Other actions");
    }
    public static class MyTask implements Runnable {
        @Override
        public void run() {
                System.out.println("Time: " + System.currentTimeMillis());
            }
        }
}
