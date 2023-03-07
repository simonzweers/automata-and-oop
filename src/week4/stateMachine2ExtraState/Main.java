/**
 * Dit programma is om dezelfde state machine te testen, maar dan met een extra staat T
 * @author Simon Zweers
 * @date 06-03-2023
 */

package week4.stateMachine2ExtraState;

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
