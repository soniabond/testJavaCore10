package module8;

public class Duck implements Talkable, Movable {
    @Override
    public void move() {
        System.out.println("Качка летить");
    }

    @Override
    public void talk() {
        System.out.println("Кря кря");
    }
}
