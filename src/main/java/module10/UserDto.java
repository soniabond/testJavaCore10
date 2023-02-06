package module10;

import java.io.Serializable;

// no need for Serializable for Gson or Jackson libraries
public class UserDto implements Serializable {

    private static Long serialVersionUID = 1l;
    private String username;
    private String email;
    private String phone;

    transient private String sql = "select *from user where username=" + username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
