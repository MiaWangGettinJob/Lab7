import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {
    public static void main(String args[]) {
        myGUI gui = new myGUI();
        gui.setSize(1000, 500);
        gui.setVisible ( true ) ;
        gui.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }// Quit the application
        });
    }
}