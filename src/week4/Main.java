package week4;


import week4.stateMachine3small.Machine;

public class Main {
    public static final int MINIMUM_WORD_LENGTH = 5;
    public static final int MAXIMUM_WORD_LENGTH = 20;

    public static void main(String[] args) {
        Machine machine = new Machine();
        String word;



        for (int i = 0; i < 5; i++) {
            word = randomInputWord(3);
            executeMachine(machine, word);
        }

        machine.a();
        System.out.println(machine);
        machine.b();
        System.out.println(machine);
        machine.c();
        System.out.println(machine);
    }

    /**
     *
     * @param numOfUniqueChars Number of unique characters in alphabetic order
     * @return A string of random Characters
     */
    public static String randomInputWord(int numOfUniqueChars) {
        int length = (int) (Math.random() * (MAXIMUM_WORD_LENGTH - MINIMUM_WORD_LENGTH) + MINIMUM_WORD_LENGTH);
        StringBuilder returnword = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int charOffset = (int) (Math.random()*numOfUniqueChars);
            //System.out.printf("%c", ('a'+ charOffset));
            returnword.append((char) ('a' + charOffset));
        }

        return returnword.toString();
    }
    public static void executeMachine(Machine machine, String inputword) {
        int sizeOfWord = inputword.length();
        for (int i = 0; i < sizeOfWord; i++) {
            switch (inputword.charAt(i)) {
                case 'a':
                    machine.a();
                    break;
                case 'b':
                    machine.b();
                    break;
                case 'c':
                    machine.c();
                    break;
                default:
                    break;
            }
            System.out.println(machine);
        }
    }
}
