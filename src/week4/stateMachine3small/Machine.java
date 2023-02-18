package week4.stateMachine3small;

public class Machine {

    public State stateQ = new StateQ();
    public State stateR = new StateR();
    public State stateS = new StateS();
    public State stateF = new StateF();

    private State currentState = stateQ;

    public void setState(State nextState) {
        this.currentState = nextState;
    }

    public void a() {
        currentState.a(this);
    }
    public void b() {
        currentState.b(this);
    }
    public void c() {
        currentState.c(this);
    }

    @Override
    public String toString() {
        return this.currentState.getClass().getSimpleName();
    }
}
