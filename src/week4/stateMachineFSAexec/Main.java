package week4.stateMachineFSAexec;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

        Machine fsaExec = new Machine();
        fsaExec.a();
        fsaExec.b();
        fsaExec.a();
        fsaExec.b();
        fsaExec.c();
        fsaExec.c();

        JFrame myJFrame = new JFrame();

        myJFrame.setVisible(true);
        myJFrame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("Up Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_DOWN) {
                    System.out.println("Down Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_LEFT) {
                    System.out.println("Left Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_RIGHT) {
                    System.out.println("Right Arrrow-Key is pressed!");
                }
            }
        });
    }
}
