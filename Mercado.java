import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mercado {
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
