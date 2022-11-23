package module3;

public class IfElseTest {
    public static void main(String[] args) {
//        int age = 18;
//        if(age >= 16 && age < 18) {
//            System.out.println("Кіно +16 буде");
//        } else if (age >= 18) {
//            System.out.println("Кіно +18 буде");
//        } else {
//            System.out.println("Кіна не буде");
//        }
//
//        System.out.println("end of program");

        boolean isBankClient = true;
        String cardType = "Gold";

        if(isBankClient) {
            System.out.println("Welcome Now you can perform bank  operations!");
            String result = new IfElseTest().resolveBankClientLogic(cardType);
            System.out.println(result);
        } else {
            System.out.println("You are not our client! Register!");
        }

//        if(isBankClient) {
//            System.out.println("Welcome Now you can perform bank  operations!");
//            if("Standart".equals(cardType)) {
//                System.out.println("Only standart operations available!");
//            } else if ("Gold".equals(cardType)) {
//                System.out.println("You have personal assistant!");
//            } else {
//                System.out.println("We don't know this card!");
//            }
//        } else {
//            System.out.println("You are not our client! Register!");
//        }
    }


    public String resolveBankClientLogic(String cardType){
        if("Standart".equals(cardType)) {
            return "Only standart operations available!";
        } else if ("Gold".equals(cardType)) {
            return "You have personal assistant!";
        } else {
            return "We don't know this card!";
        }
    }

//    public String resolveBankClientLogic(String cardType){
//        String result = null;
//        if("Standart".equals(cardType)) {
//            result = "Only standart operations available!";
//        } else if ("Gold".equals(cardType)) {
//            result = "You have personal assistant!";
//        } else {
//            result = "We don't know this card!";
//        }
//        return result;
//    }


}
