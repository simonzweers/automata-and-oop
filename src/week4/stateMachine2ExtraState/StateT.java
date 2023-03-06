package week4.stateMachine2ExtraState;

public class StateT implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateR);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateF);
    }
}
