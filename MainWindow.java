import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow{
    private JPanel contentJPanel;
    private LoginPanel loginpanel;
    

    public void displayGUI() {
        JFrame frame = new JFrame("Mercado v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentJPanel = new JPanel();
        contentJPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentJPanel.setLayout(new CardLayout());
        loginpanel = new LoginPanel(contentJPanel);
        contentJPanel.add(loginpanel, "loginpanel");

        frame.setContentPane(contentJPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainWindow().displayGUI();
            }
        });
    }
}
