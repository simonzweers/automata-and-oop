package week4.stateMachine2;

/**
 * Uitvoering van een finite state machine door middel van het state design pattern.
 * Deze uitvoering gebruikt een interface om State klassen te maken.
 */
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
     * Functie voor het veranderen van de staat
     * Gebruikt in State klassen
     * @param nextState De volgende staat van de State Machine
     */
    void setState(State nextState) {
        this.currentState = nextState;
    }

    /**
     * Functie voor het resetten van de huidige staat naar een andere staat
     * Reset de machine naar Staat Q
     */
    public void resetState() {
        if (this.currentState != stateQ) {
            this.currentState = stateQ;
        }
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
        return (this.currentState.getClass().getSimpleName());
    }
}
