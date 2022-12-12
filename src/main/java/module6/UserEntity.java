package module6;

import java.util.Random;

public class UserEntity {
    private int id;
    private String username;
    private String phone;
    private String email;

    public UserEntity(User user) {
        this(user.getFirstName() + " " + user.getLastName(), user.getMail(), user.getPhoneNumber());;
    }

    public UserEntity(String username, String phone, String email) {
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.id = new Random().nextInt();
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
