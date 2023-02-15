package week4.stateMachine1interface;

public class StateS implements State {

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
