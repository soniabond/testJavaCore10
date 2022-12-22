package module7;

import java.time.LocalDate;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String mail;
    private String phoneNumber;

    private LocalDate registrationDate;

    private LocalDate lastUpdatedDate;

    public User() {
    }

    public User(int id, String firstName, String lastName, String mail, String phoneNumber, LocalDate registrationDate, LocalDate lastUpdatedDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.registrationDate = registrationDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", registrationDate=" + registrationDate +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }

    public static class Builder {
        private int id;
        private String firstName;
        private String lastName;
        private String mail;
        private String phoneNumber;
        private LocalDate registrationDate;
        private LocalDate lastUpdatedDate;

        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder registrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public Builder lastUpdatedDate(LocalDate lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }
        public User build() {
            return new User(
                    id,
                    firstName,
                    lastName,
                    mail,
                    phoneNumber,
                    registrationDate,
                    lastUpdatedDate
            );
        }
    }
}
