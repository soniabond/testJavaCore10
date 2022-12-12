package module6;

public class RegistrationService {

    public static void main(String[] args) {
        new RegistrationService().register();
    }

    public void register() {
        //User user = new User("Ivan", "Ivanov", "user@gmail.com", "12345678");
//        System.out.println(user);
//        User user1 = new User("Petro", "Petrenko", "987654321");
//        System.out.println(user1);
//        UserEntity userEntity = new UserEntity(user);
//        System.out.println(userEntity);
        //System.out.println(user2);
//        user.setFirstName("Ivan");
//        user.setLastName("Ivanov");
//        user.setPhoneNumber("12345678");
//        user.setMail("user@gmail.com");
//        System.out.println("user = " + user);
//        String [] privs = {"ban"};
//        AdminUser adminUser = new AdminUser("Ivan", "Ivanov", "user@gmail.com", "12345678", privs);
//        System.out.println(adminUser);

        User user = new User("Ivan", "Ivanov", "user@gmail.com", "12345678");
        System.out.println(user);

        System.out.println("Registration completed!");
    }
}
