package week4.stateMachine3small;

public class Machine {

    public IState stateQ = new StateQ();
    public IState stateR = new StateR();
    public IState stateS = new StateS();
    public IState stateF = new StateF();

    private IState currentState = stateQ;

    public void setState(IState nextState) {
        this.currentState = nextState;
    }

    // Transities naar andere state
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
