package week4.stateMachine1superclass;

public class StateF extends State {
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
