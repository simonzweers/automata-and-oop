package week4.stateMachine3small;

public class StateQ implements State{
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
        machine.setState(machine.stateQ);
    }
}
