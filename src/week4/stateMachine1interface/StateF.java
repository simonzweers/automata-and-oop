package week4.stateMachine1interface;

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
