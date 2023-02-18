package module12;

import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzzService {
    private final int n = 20;
    public static volatile AtomicInteger number = new AtomicInteger(1);
    public synchronized void fizz() {
        // поміняла умову цикла щоб виводилось в порядку зростання
        while (number.get() < n) {
            if (number.get() % 3 == 0 && number.get() % 5 != 0) {
                System.out.println("fizz");
                //queue.add("fizz");
                number.incrementAndGet();
                // в нестатичному методі можна використовувати без Thread.currentThread
                notifyAll();

            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void buzz() {
        while (number.get() < n) {
            if (number.get() % 3 != 0 && number.get() % 5 == 0) {
                System.out.println("fizz");
                //queue.add("fizz");
                number.incrementAndGet();
                notifyAll();

            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void fizzbuzz () {
        while (number.get() < n) {
            if (number.get() % 3 == 0 && number.get() % 5 == 0) {
                System.out.println("fizzbuzz");
                //queue.add("fizzbuzz");
                number.incrementAndGet();
                notifyAll();

            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public synchronized void number() {
        while (number.get() < n) {
            if (number.get() % 3 != 0 && number.get() % 5 != 0) {
                System.out.println(number.get());
                //queue.add(String.valueOf(number));
                number.incrementAndGet();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
