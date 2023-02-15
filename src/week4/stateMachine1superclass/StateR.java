package week4.stateMachine1superclass;

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
