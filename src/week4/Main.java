package week4;


import week4.stateMachine2.Machine;

public class Main {
    public static final int MINIMUM_WORD_LENGTH = 5;
    public static final int MAXIMUM_WORD_LENGTH = 20;
    public static final int TRANSITION_COUNT = 2;

    public static void main(String[] args) {
        Machine machine = Machine.getInstance();
        String word;

        // Voer de state machine 5 keer uit
        for (int i = 0; i < 5; i++) {
            machine.resetState();
            word = randomInputWord(TRANSITION_COUNT);
            System.out.println("Word: " + word);
            executeMachine(machine, word);
        }
    }

    /**
     * Method that generates a random word, primarily used for finite state machines.
     * @param numOfUniqueChars Number of unique characters in alphabetic order
     * @return A string of random Characters
     */
    public static String randomInputWord(int numOfUniqueChars) {
        // Random length
        int length = (int) (Math.random() * (MAXIMUM_WORD_LENGTH - MINIMUM_WORD_LENGTH) + MINIMUM_WORD_LENGTH);

        StringBuilder returnWord = new StringBuilder();

        // Generate random chars
        for (int i = 0; i < length; i++) {
            int charOffset = (int) (Math.random()*numOfUniqueChars);
            //System.out.printf("%c", ('a'+ charOffset));
            returnWord.append((char) ('a' + charOffset));
        }

        return returnWord.toString();
    }

    /**
     * Method that executes an input word
     * @param machine Machine that executes the word
     * @param inputWord Input word for the machine
     */
    public static void executeMachine(Machine machine, String inputWord) {
        int sizeOfWord = inputWord.length();
        for (int i = 0; i < sizeOfWord; i++) {
            System.out.print("Old state: " + machine); // Print de staat voor de transitie
            switch (inputWord.charAt(i)) {
                case 'a':
                    machine.a();
                    break;
                case 'b':
                    machine.b();
                    break;
                default:
                    break;
            }
            System.out.println(" | New state: " + machine); // Print de staat na de transitie
        }
    }
}
