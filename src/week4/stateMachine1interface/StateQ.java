package week4.stateMachine1interface;

/**
 * StateQ klasse voor de Q staat van de finite state machine
 * Implementeerd State Interface
 */
public class StateQ implements State {
    @Override
    public State a() {
        return new StateQ();
    }

    @Override
    public State b() {
        return new StateR();
    }

    @Override
    public String toString() {
        return "State Q";
    }
}
