import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VendaPanel extends JPanel {
    
    private JButton voltarJButton;
    private JPanel contentJPanel;
    
    public VendaPanel(JPanel panel) {
        
        contentJPanel = panel;
        voltarJButton = new JButton("Voltar");
        voltarJButton.addActionListener(new SwitchToWindow("operatorpanel", contentJPanel));
        add(voltarJButton);


    }
    
}
