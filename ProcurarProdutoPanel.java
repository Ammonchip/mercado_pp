import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProcurarProdutoPanel extends JPanel {
    
    private JButton voltarJButton;
    private JPanel contentJPanel;
    
    public ProcurarProdutoPanel(JPanel panel) {
        
        contentJPanel = panel;
        voltarJButton = new JButton("Voltar");
        voltarJButton.addActionListener(new SwitchToWindow("operatorpanel", contentJPanel));
        add(voltarJButton);


    }
    
}