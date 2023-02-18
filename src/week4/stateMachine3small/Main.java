package week4.stateMachine3small;

public class Main {
    public static void main(String[] args) {
        Machine fsaExec = new Machine();
        fsaExec.a();
        fsaExec.b();
        fsaExec.a();
        fsaExec.b();
        fsaExec.c();
        fsaExec.c();

    }
}
