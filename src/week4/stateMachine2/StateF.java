package week4.stateMachine2;

/**
 * StateF klassen voor het veranderen van de huidige staat van het Machine object
 * Klasse voor de F staat van de finite state machine
 */
public class StateF implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateF);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateF);
    }
}
