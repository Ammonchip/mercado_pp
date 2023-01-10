import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwitchToWindow implements ActionListener{
    private String window;
    private JPanel contentJPanel;
    public SwitchToWindow(String window, JPanel contentJPanel) {
        this.window = window;
        this.contentJPanel = contentJPanel;
    }
    
    public void actionPerformed(ActionEvent e) {
        CardLayout cardLayout = (CardLayout) contentJPanel.getLayout();
        cardLayout.show(contentJPanel, window);
        
    }
    
}
