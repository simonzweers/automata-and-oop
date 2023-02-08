/**
 * Dit programma is voor de FSAexec automaat (week 1 opdracht).
 * @author Simon Zweers
 * @date 08-02-2023
 */

package week1;

/**
 * Zie de DLO practicum opgaven voor instructies.
 * TODO: make it better and understand the working. Add comments and change/add/refactor code.
 * Use flaci to draw FSA/NFA diagram with transition table and add images to your documentation.
 * Use more output to show the working of this app like:
 * Test input ababaxaaba
 * input=a current state=0
 * input=b current state=1 etc..
 *
 */
public class FSAexec {

    public static void main(String[] args) {
        System.out.println("Simon Zweers, IT102\n");


        new FSAexec().fsaExec("abcabacaaba");
        new FSAexec().fsaExec("ababacaaba");
        new FSAexec().fsaExec("abcabaaaba");
        new FSAexec().fsaExec("aabcaabcab");
        new FSAexec().fsaExec("abcabacaabac");
        new FSAexec().fsaExec("bcaabbabac");
        new FSAexec().fsaExec("baabababaabcaabaabac");
    }

    /**
     * @param input the input string for this automaton
     */
    void fsaExec(String input) {
        // Array met geldige eindstaten
        boolean[] acceptFinalState = {false, false, false, true};

        // Transition table met overgangen voor elke staat (a, b, c)
        int[][] statesTransitions = { // transition table for 3 different input symbols
                {0, 1, 0}, // state [0]
                {2, 1, 1}, // state [1]
                {0, 1, 3}, // state [2]
                {0, 1, 3}  // state [3]
        };
        System.out.printf("Input string: %s\n", input);
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            int inputCharTransition = inputChar - 'a';
            System.out.printf("State: %d | transition: %c (%d) | going to: %d\n",
                    state, inputChar, inputCharTransition, statesTransitions[state][inputCharTransition]
            );
            state = statesTransitions[state][inputCharTransition];
        }
        System.out.printf("Final state reached: %b\n", acceptFinalState[state]);
        System.out.println();
    }

}
