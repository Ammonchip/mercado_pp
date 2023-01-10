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

        adminloginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentJPanel.getLayout();
                cardLayout.show(contentJPanel, "AdminPanel");
            }
        });
        add(adminloginButton);

        operatorloginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentJPanel.getLayout();
                cardLayout.show(contentJPanel, "OperatorPanel");
            }
        });
        add(operatorloginButton);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 500));
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