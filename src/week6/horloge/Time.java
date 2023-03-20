package week6.horloge;

public class Time implements State{

    @Override
    public void sp(Context context) {
        context.setState(context.dateState);
    }

    @Override
    public void lp(Context context) {
        context.setState(context.offState);
    }
}
