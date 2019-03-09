import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingBall extends JPanel
    {
        private Timer timer = new Timer(50, new TimerListener());
        private int x = 300;

        public MovingBall()
        {
            timer.start();
        }

        private class TimerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                x -= 20;
                repaint();
            }
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.fillOval(x, 100, 20, 20);
        }

        public static void main(String[] args)
        {
            JFrame frame = new JFrame();
            frame.add(new MovingBall());
            frame.setSize(500, 500);
            frame.setVisible(true);
        }
    }

