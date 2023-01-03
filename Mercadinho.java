import java.awt.*;
import javax.swing.*;

public class Mercadinho extends JFrame {

	public Mercadinho() {
		super("Mercadinho");
		this.setLayout(null);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lTitulo = new JLabel("Mercadinho v1.0");
        lTitulo.setBounds(0, 10, 800, 20);
        lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(lTitulo);

        JLabel lDesc = new JLabel("Sistema de Controle, compra e venda de produtos");
        lDesc.setBounds(0, 25, 800, 20);
        lDesc.setHorizontalAlignment(SwingConstants.CENTER);
        lDesc.setFont(new Font("Dialog", Font.ITALIC, 8));
        this.add(lDesc);

        JButton bGer = new JButton("Gerenciar Estoque");
        bGer.setBounds(280, 55, 220, 25);
        this.add(bGer);

        JButton bVisao = new JButton("Visão Geral");
        bVisao.setBounds(280, 85, 220, 25);
        this.add(bVisao);

        JButton bCompra = new JButton("Compra");
        bCompra.setBounds(280, 115, 220, 25);
        this.add(bCompra);

        JButton bVenda = new JButton("Venda");
        bVenda.setBounds(280, 145, 220, 25);
        this.add(bVenda);

	}

	public static void main(String args[]) {
		Mercadinho mainWindow = new Mercadinho();
		// Preencha aqui os dados da janela ..
		mainWindow.setVisible(true);
	}
}
