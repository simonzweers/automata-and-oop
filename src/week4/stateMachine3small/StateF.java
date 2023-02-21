package week4.stateMachine3small;

public class StateF implements IState {
    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateQ);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateR);
    }

    @Override
    public void c(Machine machine) {
        machine.setState(machine.stateF);
    }
}
