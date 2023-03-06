package week4;


import week4.stateMachine2.Machine;

public class Main {
    public static final int MINIMUM_WORD_LENGTH = 5;
    public static final int MAXIMUM_WORD_LENGTH = 20;

    public static void main(String[] args) {
        Machine machine = new Machine();
        String word;

        for (int i = 0; i < 5; i++) {
            word = randomInputWord(2);
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
     * @param inputword Input word for the machine
     */
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
                default:
                    break;
            }
            System.out.println(machine);
        }
    }
}
