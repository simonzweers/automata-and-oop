package week4.stateMachineFSAexec;

public class StateR implements IState {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateS);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateR);
    }

    @Override
    public void c(Machine machine) {
        machine.setState(machine.stateR);
    }
}
