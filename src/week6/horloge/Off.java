package week6.horloge;

public class Off implements State{

    @Override
    public void sp(Context context) {
        context.setState(context.timeState);
    }

    @Override
    public void lp(Context context) {
        context.setState(context.offState);
    }
}
