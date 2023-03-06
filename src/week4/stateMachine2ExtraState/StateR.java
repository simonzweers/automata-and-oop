package week4.stateMachine2ExtraState;

public class StateR implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateQ);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateS);
    }
}
