package week4.stateMachine2ExtraState;

/**
 * StateS klassen voor het veranderen van de huidige staat van het Machine object
 * Klasse voor de S staat van de finite state machine
 */
public class StateS implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateQ);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateT);
    }
}
