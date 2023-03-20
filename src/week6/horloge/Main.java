package week6.horloge;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.spTransition();
        System.out.println(context);

        context.spTransition();
        System.out.println(context);

        context.lpTransition();
        System.out.println(context);
    }
}
