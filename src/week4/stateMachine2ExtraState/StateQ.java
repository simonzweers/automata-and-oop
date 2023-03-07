package week4.stateMachine2ExtraState;

/**
 * StateQ klassen voor het veranderen van de huidige staat van het Machine object
 * Klasse voor de Q staat van de finite state machine
 */
public class StateQ implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateQ);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateR);
    }
}
