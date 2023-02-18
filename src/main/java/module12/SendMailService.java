package module12;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SendMailService {

    //private ExecutorService executorService = Executors.newSingleThreadExecutor();
    private ExecutorService executorService = Executors.newFixedThreadPool(10);
    public void sendMails(List<String> mails) throws InterruptedException {
        System.out.println("I have a discount start mail sending process....");
        for (String mail : mails) {
            executorService.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Mail sended: " + mail);
            });
        }
    }
}
