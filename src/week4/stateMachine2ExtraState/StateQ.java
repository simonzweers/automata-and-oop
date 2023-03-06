package week4.stateMachine2ExtraState;

public class StateQ implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateQ);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateR);
    }
}
