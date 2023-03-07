package week4.stateMachine2;

/**
 * StateR klassen voor het veranderen van de huidige staat van het Machine object
 * Klasse voor de R staat van de finite state machine
 */
public class StateR implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateQ);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateS);
    }
}
