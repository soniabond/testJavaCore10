package module8;

public class Player implements Movable, Talkable {

    @Override
    public void move() {
        System.out.println("Гравець іде....");
    }

    @Override
    public void talk() {
        System.out.println("Всім привіт!");
    }
}
