package week4.stateMachine1interface;

/**
 * StateF klasse voor de F staat van de finite state machine
 * Implementeerd State Interface
 */
public class StateF implements State {
    @Override
    public State a() {
        return new StateF();
    }

    @Override
    public State b() {
        return new StateF();
    }

    @Override
    public String toString() {
        return "State F (Final)";
    }
}
