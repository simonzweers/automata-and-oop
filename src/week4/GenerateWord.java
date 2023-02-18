package week4;

public class GenerateWord {
    public static final int MINIMUM_WORD_LENGTH = 5;
    public static final int MAXIMUM_WORD_LENGTH = 20;

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
}
