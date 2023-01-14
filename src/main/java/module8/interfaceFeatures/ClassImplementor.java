package module8.interfaceFeatures;

public class ClassImplementor implements InterfaceA, InterfaceB {

    @Override
    public void someMethod(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        InterfaceA testerA = new ClassImplementor();
        testerA.someMethod(7);

        InterfaceB testerB = new ClassImplementor();
        testerB.someMethod(7);
    }
}
