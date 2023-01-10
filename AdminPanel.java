import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminPanel extends JPanel{
    private JButton 
        logoutJButton, 
        vendaJButton, 
        listadeprodutosJButton, 
        procurarprodutoJButton, 
        compraJButton,
        controleestoqueJButton,
        visaogeralJButton,
        relatorioJButton;

    private JPanel contentJPanel;

    public AdminPanel(JPanel panel) {
        contentJPanel = panel;

        logoutJButton = new JButton("Logout");
        vendaJButton = new JButton("Venda");
        listadeprodutosJButton = new JButton("Lista de Produtos");
        procurarprodutoJButton = new JButton("Buscar Produto");

        logoutJButton.addActionListener(new SwitchToWindow("loginpanel", panel)); 
        add(logoutJButton);

        vendaJButton.addActionListener(new SwitchToWindow("vendapanel", panel));
        add(vendaJButton);

        listadeprodutosJButton.addActionListener(new SwitchToWindow("listadeprodutospanel", panel));
        add(listadeprodutosJButton);

        procurarprodutoJButton.addActionListener(new SwitchToWindow("procurarprodutopanel", panel));
        add(procurarprodutoJButton);

        compraJButton.addActionListener(new SwitchToWindow("comprapanel", panel));
        add(compraJButton);

        controleestoqueJButton.addActionListener(new SwitchToWindow("controleestoquepanel", panel));
        add(controleestoqueJButton);

        visaogeralJButton.addActionListener(new SwitchToWindow("visaogeralpanel", panel));
        add(visaogeralJButton);

        relatorioJButton.addActionListener(new SwitchToWindow("relatoriopanel", panel));
        add(relatorioJButton);




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