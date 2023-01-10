import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPanel extends JPanel{
    private JButton adminloginButton;
    private JButton operatorloginButton;
    private JPanel contentJPanel;
    

    public LoginPanel(JPanel panel) {
        contentJPanel = panel;
        adminloginButton = new JButton("Admin");
        operatorloginButton = new JButton("Operator");

        adminloginButton.addActionListener(new SwitchToWindow("adminpanel", contentJPanel));
        add(adminloginButton);

        operatorloginButton.addActionListener(new SwitchToWindow("operatorpanel", contentJPanel));
        add(operatorloginButton);
    }
}
/*
 * class MyPanel extends JPanel 
{
    private JButton jcomp4;
    private JPanel contentPane;

    public MyPanel(JPanel panel) 
    {
        contentPane = panel;
        setOpaque(true);
        setBackground(Color.RED.darker().darker());
        //construct components
        jcomp4 = new JButton ("openNewWindow");
        jcomp4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "Panel 2");
            }
        });
        add(jcomp4);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 500));
    }
}
 */