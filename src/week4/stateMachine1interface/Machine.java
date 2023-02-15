package week4.stateMachine1interface;

public class Machine {
    private State currentstate = new StateQ();

    public Machine() {

    }

    public void processA() {
        System.out.println(currentstate);
        currentstate = currentstate.a();
    }

    public void processB() {
        System.out.println(currentstate);
        currentstate = currentstate.b();
    }

    @Override
    public String toString() {
        return "Machine created";
    }
}
