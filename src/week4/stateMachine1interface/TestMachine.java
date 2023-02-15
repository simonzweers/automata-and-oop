package week4.stateMachine1interface;

public class TestMachine {
    public static final int MINUNUM_WORD_LENGTH = 5;
    public static final int MAXIMUM_WORD_LENGTH = 20;
    public static void main(String[] args) {
        Machine testMachine = new Machine();
        testMachine.processB();
        testMachine.processB();
        testMachine.processB();
        testMachine.processB();

        for (int i = 0; i < 10; i++) {
            System.out.println(randomInputWord(2));
        }
    }

    /**
     *
     * @param numOfUniqueChars Number of unique chars in the output word
     * @return The output word
     */
    public static String randomInputWord(int numOfUniqueChars) {
        int length = (int) (Math.random()*(MAXIMUM_WORD_LENGTH-MINUNUM_WORD_LENGTH)+MINUNUM_WORD_LENGTH);
        StringBuilder returnword = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            int charOffset = (int) (Math.random()*numOfUniqueChars);
            //System.out.printf("%c", ('a'+ charOffset));
            returnword.append((char) ('a' + charOffset));
        }

        return returnword.toString();
    }
}
