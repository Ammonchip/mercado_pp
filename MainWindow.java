import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow {

    private JPanel contentJPanel;
    private LoginPanel loginPanel;
    private OperatorPanel operatorPanel;
    private VendaPanel vendaPanel;
    private ListaProdutosPanel listaProdutosPanel;
    private ProcurarProdutoPanel procurarProdutoPanel;
    private CompraPanel compraPanel;
    private ControleEstoquePanel controleEstoquepanel;
    private VisaoGeralPanel visaoGeralPanel;
    private RelatorioPanel relatorioPanel;

    

    public void displayGUI() {
        JFrame frame = new JFrame("Mercado v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentJPanel = new JPanel();
        contentJPanel.setSize(800, 600);
        contentJPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        contentJPanel.setLayout(new CardLayout());
        
        loginPanel = new LoginPanel(contentJPanel);
        operatorPanel = new OperatorPanel(contentJPanel);
        vendaPanel = new VendaPanel(contentJPanel);
        listaProdutosPanel = new ListaProdutosPanel(contentJPanel);
        procurarProdutoPanel = new ProcurarProdutoPanel(contentJPanel);

        contentJPanel.add(loginPanel, "loginpanel");
        contentJPanel.add(operatorPanel, "operatorpanel");
        contentJPanel.add(vendaPanel, "vendapanel");
        contentJPanel.add(listaProdutosPanel, "listadeprodutospanel");
        contentJPanel.add(procurarProdutoPanel, "procurarprodutopanel");
        
        frame.setContentPane(contentJPanel);
        
        //frame.pack();
        frame.setSize(800, 600);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
