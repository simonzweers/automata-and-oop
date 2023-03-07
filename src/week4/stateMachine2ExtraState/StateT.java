package week4.stateMachine2ExtraState;

/**
 * StateT klassen voor het veranderen van de huidige staat van het Machine object
 * Klasse voor de T staat van de finite state machine
 */
public class StateT implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateR);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateF);
    }
}
