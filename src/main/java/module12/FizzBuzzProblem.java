package module12;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzzProblem {
    public static volatile AtomicInteger number = new AtomicInteger(20);
    public static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue();
    public static void main(String[] args) {
//        for (int i = 1; i <= number; i++) {
//            if(i % 3 == 0 && i % 5 != 0) {
//                System.out.println("fizz");
//            } else if (i % 15 == 0) {
//                System.out.println("fizzbuzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //якщо перевірка не пройшла успішно,
        //значить вона точно пройде успішно в якомусь іншому потоці.
        // Значить данному потоку треба почекати, поки йому не кажуть, що можна пробуваи перевіряти знов

        // Якщо перевірка пройшла успішно, значить вона точно не пройде
        // успішно в жодному іншому потоці. Значить я можу сказати всім потокам
        //  що вони можуть продовжувати роботу намагаючить перевірити наступне число

        ExecutorService service = Executors.newFixedThreadPool(5);
        // всі лямбди були СКОПІЙОВАНІ ЯК Є в FIzzBuzzService.
        // ЧОму не залишити тут? Бо треба було додати synchronized
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        service.submit(fizzBuzzService::fizz);
        service.submit(fizzBuzzService::buzz);
        service.submit(fizzBuzzService::fizzbuzz);
        service.submit(fizzBuzzService::number);
        service.shutdown();

        // ЗАМІНИТИ СІАУТ НА ЧЕРГУ САМОСТІЙНО ТАК ЯК Я ПОКАЗУВАЛА НА ЛЕКЦІІ

//        service.submit(() -> {
//           while (true) {
//               if(queue.isEmpty()) {
//                   Thread.sleep(1000);
//               }
//               while (!queue.isEmpty()) {
//                   System.out.println(queue.poll());
//               }
//
//           }
//        });

    }
}
