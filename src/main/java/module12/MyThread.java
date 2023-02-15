package module12;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
