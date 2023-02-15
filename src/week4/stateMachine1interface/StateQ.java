package week4.stateMachine1interface;

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
