package module12;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
//        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        System.out.println("Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());
//
//        Thread thread = new MyThread();
//        thread.start();
//        new MyThread().start();

//        Thread newTread = new Thread(() -> {
//            System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
//            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        });
//        newTread.start();

        System.out.println("1");
        new Thread(() -> {
            System.out.println("2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("3");
        }).start();
        Thread.sleep(1000);
        System.out.println("4");
    }
}
