package week4.stateMachine3small;

public class StateR implements State{

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
