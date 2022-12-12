package module6;

public class User {

    private final String firstName;
    private final String lastName;
    private final String mail;
    private final String phoneNumber;

//    public User() {
//        System.out.println("User empty constructor");
//    }

    public User(String firstName, String lastName, String mail, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        System.out.println("User constructor with params");
    }

//    public User(String firstName, String lastName,  String phoneNumber) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//        System.out.println("User constructor with params");
//    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
