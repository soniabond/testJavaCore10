package module3;

public class TernaryTest {
    public static void main(String[] args) {
//        String result = new TernaryTest().resolveBankClientLogicTernary("dfhf");
//        System.out.println("result = " + result);
//        boolean isPremium = true;
//        new TernaryTest().resolveBankClientLogicTernary(isPremium ? "Gold" : "Standart");

        System.out.println("new TernaryTest().findMax(2, 6, 1) = " + new TernaryTest().findMaxTernary(2, 6, 1));
    }

    public String resolveBankClientLogic(String cardType){
        if("Standart".equals(cardType)) {
            return "Only standart operations available!";
        } else {
            return "We don't know this card!";
        }

    }

//    public void resolveBankClientLogicTernary(String cardType){
//        String res = "Standart".equals(cardType) ? "Only standart operations available!" : "We don't know this card!";
//        System.out.println("res = " + res);
//    }

    public String resolveBankClientLogicTernary(String cardType){
        return "Standart".equals(cardType) ?
                "Only standart operations available!"
                : "We don't know this card!";
    }

    public int findMax(int a, int b, int c){
        if(a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else { // b > a
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
    public int findMaxTernary(int a, int b, int c) {
        return a > b ?
                (a > c ? a : c) :
                (b > c ? b : c);
    }

}
