package module10;

import module6.User;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        UserDto user = new UserDto();
//        user.setEmail("user@gmail.com");
//        user.setPhone("+3806666666");
//        user.setUsername("user userovich");
//        OutputStream fos = new FileOutputStream("user.bin");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(user);

        InputStream fis = new FileInputStream("user.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        UserDto readUserDto = (UserDto) ois.readObject();
        System.out.println("readUserDto = " + readUserDto);
    }
}
