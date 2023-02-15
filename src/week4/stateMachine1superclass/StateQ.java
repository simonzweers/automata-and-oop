package week4.stateMachine1superclass;

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
