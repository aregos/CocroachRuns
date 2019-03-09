import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public class View extends JFrame {
    Thread thread1, thread2;
    View() throws IOException, InvocationTargetException, InterruptedException {
        Cockroach c1 = new Cockroach(2);
        Cockroach c2 = new Cockroach(3);
        JFrame.setDefaultLookAndFeelDecorated(true);
        setExtendedState(MAXIMIZED_BOTH);
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setPreferredSize(new Dimension(1200,600));
        window.setVisible(true);
        window.add(c1);
        window.add(c2);
        window.pack();
        thread1 = new Thread(c1);
        thread2 = new Thread(c2);
        thread1.start();
        thread2.start();
    }



}
