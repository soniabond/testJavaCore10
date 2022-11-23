package module3;

public class SwitchTest {
    public static void main(String[] args) {
        String cardType = "Gold";
//        if ("Standart".equals(cardType)) {
//            System.out.println("Only standart operations available!");
//        } else if ("Gold".equals(cardType)) {
//            System.out.println("You have personal assistant!");
//        } else if ("Platinum".equals(cardType)) {
//            System.out.println("You VIP user!");
//        } else {
//            System.out.println("We don't know this card!");
//        }

        switch (cardType) {
            case "Standart" : {
                System.out.println("Only standart operations available!");
            } break;
            case "Gold": {
                System.out.println("You have personal assistant!");
            } break;
            case "Platinum": {
                System.out.println("You VIP user!");
            } break;
            default: {
                System.out.println("We don't know this card!");
            }
        }

        int a = 1;
        switch (a) {
            case 5: {

            }break;
            case 1 : {

            }break;
        }
    }

//    public void scopeTest() {
//        int a = 5;
//        if(true) {
//            a = 8;
//            int res = 6;
//            {
//                a = 15;
//                int t = 10;
//            }
//            t = 6;
//        }
//        res = 7;
//    }
}
