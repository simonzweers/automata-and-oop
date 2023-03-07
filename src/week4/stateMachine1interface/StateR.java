package week4.stateMachine1interface;

/**
 * StateR klasse voor de R staat van de finite state machine
 * Implementeerd State Interface
 */
public class StateR implements State {
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
