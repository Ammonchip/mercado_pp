import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OperatorPanel extends JPanel{
    private JButton logoutJButton, vendaJButton, listadeprodutosJButton, procurarprodutoJButton;
    private JPanel contentJPanel;

    public OperatorPanel(JPanel panel) {
        contentJPanel = panel;

        logoutJButton = new JButton("Logout");
        vendaJButton = new JButton("Venda");
        listadeprodutosJButton = new JButton("Lista de Produtos");
        procurarprodutoJButton = new JButton("Buscar Produto");

        logoutJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentJPanel.getLayout();
                cardLayout.show(contentJPanel, "loginpanel");
            }
        }); 
        add(logoutJButton);

        vendaJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentJPanel.getLayout();
                cardLayout.show(contentJPanel, "vendapanel");
            }
        }); 
        add(vendaJButton);

        listadeprodutosJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentJPanel.getLayout();
                cardLayout.show(contentJPanel, "listadeprodutospanel");
            }
        }); 
        add(listadeprodutosJButton);

        procurarprodutoJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentJPanel.getLayout();
                cardLayout.show(contentJPanel, "procurarprodutopanel");
            }
        }); 
        add(procurarprodutoJButton);
    }
}

/*
 * public class LoginPanel extends JPanel{
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
 */