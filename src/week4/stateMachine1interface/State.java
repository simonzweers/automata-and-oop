package week4.stateMachine1interface;

public interface State {
    default State a() {
        return null;
    }
    default State b() {
        return null;
    }
}
