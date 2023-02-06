package module10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.List;

public class GsonTest {
    public static void main(String[] args) throws IOException {
        UserDto userDto = new UserDto();
        userDto.setUsername("Ivan Ivanov");
        userDto.setPhone("+321654987");
        userDto.setEmail("ivanivanov@gmail.com");
        UserDto userDto1 = new UserDto();
        userDto1.setUsername("Inna Ivanova");
        userDto1.setPhone("+32165464684");
        userDto1.setEmail("inna@gmail.com");

         UserDto [] users = {userDto1, userDto};

//
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String toJson = gson.toJson(users);
//        System.out.println("toJson = " + toJson);
//
////        OutputStream fos = new FileOutputStream("users.json");
////        fos.write(toJson.getBytes());
//        FileWriter fileWriter = new FileWriter("users.json");
//        gson.toJson(users, fileWriter);
//        fileWriter.close();

        Gson gson = new Gson();
//        String toJson = gson.toJson(userDto);
//        System.out.println("userDto source = " + userDto);
//        UserDto res = gson.fromJson(toJson, UserDto.class);
//        System.out.println("res = " + res);

        FileReader fileReader = new FileReader("users.json");
        UserDto res = gson.fromJson(fileReader, UserDto.class);
        System.out.println("res = " + res);


    }
}
