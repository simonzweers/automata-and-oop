package week4.stateMachine2;

public class StateF implements State {

    @Override
    public void a(Machine machine) {
        machine.setState(machine.stateF);
    }

    @Override
    public void b(Machine machine) {
        machine.setState(machine.stateF);
    }
}
