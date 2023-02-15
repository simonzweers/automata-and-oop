package week4.stateMachine2;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.a();
        System.out.println(machine);
        machine.b();
        System.out.println(machine);
        machine.a();
        System.out.println(machine);
        machine.a();
        System.out.println(machine);
    }
}
