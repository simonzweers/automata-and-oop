package week6.horloge;


/**
 * Context class to create a Watch statemachine+
 */
public class Context {

    State offState = new Off();
    State timeState = new Time();
    State dateState = new Date();

    State currentState = offState;

    public void setState(State newState) {
        currentState = newState;
    }

    public void lpTransition() {
        currentState.lp(this);
    }

    public void spTransition() {
        currentState.sp(this);
    }

    @Override
    public String toString() {
        return currentState.getClass().getSimpleName();
    }
}
