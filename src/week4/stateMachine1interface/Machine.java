package week4.stateMachine1interface;

/**
 * Uitvoering van een finite state machine door middel van het state design pattern.
 * Deze uitvoering gebruikt een interface om State klassen te maken.
 */
public class Machine {
    private State currentstate = new StateQ();

    /**
     * Maakt een nieuw Machine object aan
     */
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
