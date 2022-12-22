package module7;

import java.time.LocalDate;

public class BuilderTest {
    public static void main(String[] args) {
        User user = new User.Builder()
                .id(1)
                .firstName("Ivan")
                .mail("@gmail.com")
                .registrationDate(LocalDate.now())
                .phoneNumber("+3605555555")
                .build();
        System.out.println("user = " + user);
    }
}
