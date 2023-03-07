package week4.stateMachine1superclass;

/**
 * StateS klasse voor de S staat van de finite state machine
 * Extend State klasse
 */
public class StateS extends State {

    @Override
    public State a() {
        return new StateQ();
    }

    @Override
    public State b() {
        return new StateF();
    }

    @Override
    public String toString() {
        return "State S";
    }
}
