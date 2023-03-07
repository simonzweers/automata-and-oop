package week4.stateMachine1superclass;

/**
 * StateQ klasse voor de Q staat van de finite state machine
 * Extend State klasse
 */
public class StateQ extends State {
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
