package week4.stateMachine2;

public class Machine {
    private State currentState;

    public final State stateQ = new StateQ();
    public final State stateR = new StateR();
    public final State stateS = new StateS();
    public final State stateF = new StateF();

    public Machine() {
        this.currentState = stateQ; // Starttoestand
    }

    /**
     *
     * @param nextState De volgende staat van de State Machine
     */
    public void setState(State nextState) {
        this.currentState = nextState;
    }

    public void a() {
        //System.out.println("Transitie A");
        currentState.a(this);
    }

    public void b() {
        //System.out.println("transitie B");
        currentState.b(this);
    }

    @Override
    public String toString() {
        return ("Current state: " + this.currentState.getClass().getSimpleName());
    }
}
