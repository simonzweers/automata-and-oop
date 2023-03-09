/**
 * Dit programma is om een state machine te testen
 * @author Simon Zweers
 * @date 15-02-2023
 */

package week4.stateMachine2;

public class Main {
    public static void main(String[] args) {
        Machine machine = Machine.getInstance();
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
