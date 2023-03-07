package week4.stateMachine1superclass;

/**
 * StateR klasse voor de R staat van de finite state machine
 * Extend State klasse
 */
public class StateR extends State {
    @Override
    public State a() {
        return new StateQ();
    }

    @Override
    public State b() {
        return new StateS();
    }

    @Override
    public String toString() {
        return "state Q";
    }
}
