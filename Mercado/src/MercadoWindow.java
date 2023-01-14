import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class MercadoWindow {

	public JFrame frmMercadinhoArrochado;
	private JTextField usuario_textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JTextField textField_4;
	private JTable table_2;
	private JTextField textField_5;
	private JTextField textConCod;
	private JTextField textConDesc;
	private JTextField textConVen;
	private JTextField textConQuant;
	private JTextField textConMed;
	private JTextField textConCom;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTable table_3;
	private Usuario usuario = null;
	
	private void tableUpdate(JTable tabela, ArrayList<Produto> listadeprodutos) {
		
		DefaultTableModel DFT = (DefaultTableModel) tabela.getModel();
		DFT.setRowCount(0);
		
		for (int i = 0; i < listadeprodutos.size(); i++) {
			Vector v2 = new Vector();
            v2.add(listadeprodutos.get(i).getCodigo());
            v2.add(listadeprodutos.get(i).getDescricao());
            v2.add(listadeprodutos.get(i).getVenda());
            v2.add(listadeprodutos.get(i).getQuantidade());
            v2.add(listadeprodutos.get(i).getMedida());
            v2.add(listadeprodutos.get(i).getCompra());
            DFT.addRow(v2);
        }
        
	}

	/**
	 * Create the application.
	 */
	public MercadoWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMercadinhoArrochado = new JFrame();
		frmMercadinhoArrochado.setTitle("Mercadinho Arrochado");
		frmMercadinhoArrochado.setBounds(100, 100, 800, 600);
		frmMercadinhoArrochado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMercadinhoArrochado.getContentPane().setLayout(new CardLayout());
		
		
		JPanel login_panel = new JPanel();
		login_panel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmMercadinhoArrochado.getContentPane().add(login_panel, "login_panel");
		login_panel.setLayout(null);
		
		JPanel menu_panel = new JPanel();
		frmMercadinhoArrochado.getContentPane().add(menu_panel, "menu_panel");
		menu_panel.setLayout(null);
		
		JPanel group_panel = new JPanel();
		group_panel.setBounds(10, 11, 764, 505);
		menu_panel.add(group_panel);
		group_panel.setLayout(new CardLayout(0, 0));
		
		
		
		usuario_textField = new JTextField();
		usuario_textField.setBounds(396, 252, 178, 42);
		login_panel.add(usuario_textField);
		usuario_textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(276, 262, 95, 23);
		login_panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(277, 319, 73, 14);
		login_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mercado v1.0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(277, 199, 155, 23);
		login_panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(396, 305, 178, 42);
		login_panel.add(passwordField);
		
		JPanel venda_panel = new JPanel();
		group_panel.add(venda_panel, "venda_panel");
		venda_panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Venda de Produtos");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 11, 169, 20);
		venda_panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(56, 39, 430, 20);
		venda_panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Código:");
		lblNewLabel_4.setBounds(10, 42, 46, 14);
		venda_panel.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(561, 39, 67, 20);
		venda_panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quatidade:");
		lblNewLabel_5.setBounds(496, 42, 55, 14);
		venda_panel.add(lblNewLabel_5);
		
		JRadioButton rdbtnDebito = new JRadioButton("Débito");
		rdbtnDebito.setBounds(10, 466, 73, 23);
		venda_panel.add(rdbtnDebito);
		
		JRadioButton rdbtnCredito = new JRadioButton("Crédito");
		rdbtnCredito.setBounds(85, 466, 67, 23);
		venda_panel.add(rdbtnCredito);
		
		JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
		rdbtnDinheiro.setBounds(154, 466, 73, 23);
		venda_panel.add(rdbtnDinheiro);
		
		JLabel lblNewLabel_9 = new JLabel("Forma de Pagamento:");
		lblNewLabel_9.setBounds(10, 446, 119, 14);
		venda_panel.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(249, 467, 109, 20);
		venda_panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Total Pagamento:");
		lblNewLabel_10.setBounds(249, 446, 109, 14);
		venda_panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Troco:");
		lblNewLabel_11.setBounds(368, 446, 46, 14);
		venda_panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("0,00");
		lblNewLabel_12.setBounds(368, 471, 46, 14);
		venda_panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Preço Total:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(428, 446, 89, 39);
		venda_panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("0,00");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_14.setBounds(527, 446, 89, 39);
		venda_panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Usuário:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(570, 11, 46, 14);
		venda_panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Operador");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16.setBounds(622, 11, 118, 14);
		venda_panel.add(lblNewLabel_16);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 730, 365);
		venda_panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Descri\u00E7\u00E3o", "Pre\u00E7o", "Quantidade", "Medida"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Float.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		scrollPane.setViewportView(table);
		
		JPanel pesquisa_panel = new JPanel();
		group_panel.add(pesquisa_panel, "pesquisa_panel");
		pesquisa_panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 70, 730, 365);
		pesquisa_panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Descri\u00E7\u00E3o", "Venda", "Quantidade", "Medida", "Compra"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Float.class, Integer.class, String.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(150);
		DefaultTableModel table_1model = (DefaultTableModel) table_1.getModel();
		TableRowSorter<DefaultTableModel> sorter;
		sorter = new TableRowSorter<DefaultTableModel>(table_1model);
		table_1.setRowSorter(sorter);
		
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_6 = new JLabel("Filtro de Busca:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 446, 98, 17);
		pesquisa_panel.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 446, 632, 20);
		pesquisa_panel.add(textField_4);
		textField_4.setColumns(10);
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(null, "funcionou!");
				RowFilter<DefaultTableModel, Object> rf = null;
		        //If current expression doesn't parse, don't update.
		        try {
		            rf = RowFilter.regexFilter(textField_4.getText(), 0);
		        } catch (java.util.regex.PatternSyntaxException ex) {
		            return;
		        }
		        sorter.setRowFilter(rf);
				
			}
		});
		
		JLabel lblNewLabel_7 = new JLabel("Lista de Produtos e Pesquisa:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(10, 11, 240, 17);
		pesquisa_panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_15_1 = new JLabel("Usuário:");
		lblNewLabel_15_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_1.setBounds(570, 11, 46, 14);
		pesquisa_panel.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("Operador");
		lblNewLabel_16_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16_1.setBounds(622, 11, 118, 14);
		pesquisa_panel.add(lblNewLabel_16_1);
		
		JPanel relatorio_panel = new JPanel();
		group_panel.add(relatorio_panel, "relatorio_panel");
		relatorio_panel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Relatório de Compras e Vendas:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(10, 11, 262, 20);
		relatorio_panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_16_1_1 = new JLabel("Operador");
		lblNewLabel_16_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16_1_1.setBounds(636, 11, 118, 14);
		relatorio_panel.add(lblNewLabel_16_1_1);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Usuário:");
		lblNewLabel_15_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_1_1.setBounds(584, 11, 46, 14);
		relatorio_panel.add(lblNewLabel_15_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 42, 744, 452);
		relatorio_panel.add(scrollPane_2);
		
		JTextArea txtarea = new JTextArea();
		scrollPane_2.setViewportView(txtarea);
		
		JPanel controle_panel = new JPanel();
		group_panel.add(controle_panel, "controle_panel");
		controle_panel.setLayout(null);
		
		JLabel lblNewLabel_8_1 = new JLabel("Controle de Estoque");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8_1.setBounds(10, 11, 262, 20);
		controle_panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_16_1_1_1 = new JLabel("Operador");
		lblNewLabel_16_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16_1_1_1.setBounds(636, 11, 118, 14);
		controle_panel.add(lblNewLabel_16_1_1_1);
		
		JLabel lblNewLabel_15_1_1_1 = new JLabel("Usuário:");
		lblNewLabel_15_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_1_1_1.setBounds(584, 11, 46, 14);
		controle_panel.add(lblNewLabel_15_1_1_1);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(10, 42, 744, 228);
		controle_panel.add(scrollPane_2_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Descri\u00E7\u00E3o", "Venda", "Quantidade", "Medida", "Compra"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Float.class, Integer.class, String.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_2_1.setViewportView(table_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(122, 281, 632, 20);
		controle_panel.add(textField_5);
		
		JLabel lblNewLabel_6_1 = new JLabel("Filtro de Busca:");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(20, 281, 98, 17);
		controle_panel.add(lblNewLabel_6_1);
		
		textConCod = new JTextField();
		textConCod.setBounds(122, 312, 249, 20);
		controle_panel.add(textConCod);
		textConCod.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Código");
		lblNewLabel_17.setBounds(39, 315, 79, 14);
		controle_panel.add(lblNewLabel_17);
		
		textConDesc = new JTextField();
		textConDesc.setBounds(122, 343, 249, 20);
		controle_panel.add(textConDesc);
		textConDesc.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Descrição");
		lblNewLabel_18.setBounds(39, 346, 79, 14);
		controle_panel.add(lblNewLabel_18);
		
		textConVen = new JTextField();
		textConVen.setBounds(122, 375, 249, 20);
		controle_panel.add(textConVen);
		textConVen.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Venda");
		lblNewLabel_19.setBounds(39, 378, 79, 14);
		controle_panel.add(lblNewLabel_19);
		
		textConQuant = new JTextField();
		textConQuant.setBounds(498, 312, 256, 20);
		controle_panel.add(textConQuant);
		textConQuant.setColumns(10);
		
		textConMed = new JTextField();
		textConMed.setColumns(10);
		textConMed.setBounds(498, 343, 256, 20);
		controle_panel.add(textConMed);
		
		textConCom = new JTextField();
		textConCom.setColumns(10);
		textConCom.setBounds(498, 375, 256, 20);
		controle_panel.add(textConCom);
		
		JLabel lblNewLabel_20 = new JLabel("Quantidade");
		lblNewLabel_20.setBounds(409, 315, 79, 14);
		controle_panel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Medida");
		lblNewLabel_21.setBounds(409, 346, 79, 14);
		controle_panel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Compra");
		lblNewLabel_22.setBounds(409, 378, 79, 14);
		controle_panel.add(lblNewLabel_22);
		
		JPanel compra_panel = new JPanel();
		group_panel.add(compra_panel, "compra_panel");
		compra_panel.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(87, 424, 249, 20);
		compra_panel.add(textField_12);
		
		JLabel lblNewLabel_19_1 = new JLabel("Venda");
		lblNewLabel_19_1.setBounds(26, 427, 51, 14);
		compra_panel.add(lblNewLabel_19_1);
		
		JLabel lblNewLabel_18_1 = new JLabel("Descrição");
		lblNewLabel_18_1.setBounds(10, 395, 67, 14);
		compra_panel.add(lblNewLabel_18_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(87, 393, 249, 20);
		compra_panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(87, 361, 249, 20);
		compra_panel.add(textField_14);
		
		JLabel lblNewLabel_17_1 = new JLabel("Código");
		lblNewLabel_17_1.setBounds(23, 364, 54, 14);
		compra_panel.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_20_1 = new JLabel("Quantidade");
		lblNewLabel_20_1.setBounds(359, 364, 67, 14);
		compra_panel.add(lblNewLabel_20_1);
		
		JLabel lblNewLabel_21_1 = new JLabel("Medida");
		lblNewLabel_21_1.setBounds(359, 395, 67, 14);
		compra_panel.add(lblNewLabel_21_1);
		
		JLabel lblNewLabel_22_1 = new JLabel("Compra");
		lblNewLabel_22_1.setBounds(359, 427, 67, 14);
		compra_panel.add(lblNewLabel_22_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(436, 361, 256, 20);
		compra_panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(436, 392, 256, 20);
		compra_panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(436, 424, 256, 20);
		compra_panel.add(textField_17);
		
		JLabel lblNewLabel_16_1_1_1_1 = new JLabel("Operador");
		lblNewLabel_16_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16_1_1_1_1.setBounds(636, 11, 118, 14);
		compra_panel.add(lblNewLabel_16_1_1_1_1);
		
		JLabel lblNewLabel_15_1_1_1_1 = new JLabel("Usuário:");
		lblNewLabel_15_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_1_1_1_1.setBounds(584, 11, 46, 14);
		compra_panel.add(lblNewLabel_15_1_1_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Compra de Produtos");
		lblNewLabel_8_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8_1_1.setBounds(10, 11, 262, 20);
		compra_panel.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("Preço Total:");
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13_1.setBounds(10, 455, 89, 39);
		compra_panel.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("0,00");
		lblNewLabel_14_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_14_1.setBounds(109, 455, 89, 39);
		compra_panel.add(lblNewLabel_14_1);
		
		JScrollPane scrollPane_2_1_1 = new JScrollPane();
		scrollPane_2_1_1.setBounds(10, 42, 744, 228);
		compra_panel.add(scrollPane_2_1_1);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Descri\u00E7\u00E3o", "Venda", "Quantidade", "Medida", "Compra"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Float.class, Integer.class, String.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_3.getColumnModel().getColumn(0).setResizable(false);
		table_3.getColumnModel().getColumn(1).setResizable(false);
		table_3.getColumnModel().getColumn(2).setResizable(false);
		table_3.getColumnModel().getColumn(3).setResizable(false);
		table_3.getColumnModel().getColumn(4).setResizable(false);
		table_3.getColumnModel().getColumn(5).setResizable(false);
		scrollPane_2_1_1.setViewportView(table_3);
		
		JLabel lblNewLabel_23 = new JLabel("Saldo:");
		lblNewLabel_23.setBounds(26, 281, 89, 14);
		compra_panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Valor Financeiro em Produtos:");
		lblNewLabel_24.setBounds(173, 281, 170, 14);
		compra_panel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Quantidade de Produtos:");
		lblNewLabel_25.setBounds(398, 281, 149, 14);
		compra_panel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Lucro Total:");
		lblNewLabel_26.setBounds(588, 281, 83, 14);
		compra_panel.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("0,00");
		lblNewLabel_27.setBounds(26, 306, 89, 14);
		compra_panel.add(lblNewLabel_27);
		
		JLabel lblNewLabel_27_1 = new JLabel("0,00");
		lblNewLabel_27_1.setBounds(173, 306, 170, 14);
		compra_panel.add(lblNewLabel_27_1);
		
		JLabel lblNewLabel_27_2 = new JLabel("0");
		lblNewLabel_27_2.setBounds(398, 306, 149, 14);
		compra_panel.add(lblNewLabel_27_2);
		
		JLabel lblNewLabel_27_3 = new JLabel("0,00");
		lblNewLabel_27_3.setBounds(588, 306, 83, 14);
		compra_panel.add(lblNewLabel_27_3);
		
		JButton btnLoginButton = new JButton("Login");
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(passwordField.getPassword()).trim();
				String str_usuario = usuario_textField.getText();
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				usuario = usuarioDAO.getUsuario(str_usuario);
				if (usuario != null) {
					if (usuario.getSenha().equals(senha)) {
						JOptionPane.showMessageDialog(btnLoginButton, "Bem vindo "+usuario.getNome());
						lblNewLabel_16.setText(usuario.getNome());
						lblNewLabel_16_1.setText(usuario.getNome());
						lblNewLabel_16_1_1.setText(usuario.getNome());
						lblNewLabel_16_1_1_1.setText(usuario.getNome());
						lblNewLabel_16_1_1_1_1.setText(usuario.getNome());
						
						
						usuario_textField.setText("");
						passwordField.setText("");
						CardLayout cl = (CardLayout)(frmMercadinhoArrochado.getContentPane().getLayout());
					    cl.show(frmMercadinhoArrochado.getContentPane(), "menu_panel");
					    
					    CardLayout c2 = (CardLayout)(group_panel.getLayout());
					    c2.show(group_panel, "venda_panel");
					} else JOptionPane.showMessageDialog(btnLoginButton, "Usuário ou Senha Incorreta!");
				} else JOptionPane.showMessageDialog(btnLoginButton, "Usuário ou Senha Incorreta!");
				
			}
		});
		btnLoginButton.setBounds(277, 358, 297, 42);
		login_panel.add(btnLoginButton);
		
		JButton btnCompraEAdd = new JButton("Comprar e Adicionar");
		btnCompraEAdd.setBounds(584, 454, 170, 44);
		compra_panel.add(btnCompraEAdd);
		
		JButton btnAddControle = new JButton("Adicionar");
		btnAddControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto(textConCod.getText(), 
											  textConDesc.getText(), 
											  textConMed.getText(), 
											  Integer.parseInt(textConQuant.getText()),
											  Float.parseFloat(textConCom.getText()),
											  Float.parseFloat(textConVen.getText()));
				
				ProdutoDAO produtoDAO = new ProdutoDAO();
				if (produtoDAO.addProduto(produto)) {
					JOptionPane.showMessageDialog(btnAddControle, "Produto adicionado!");
					tableUpdate(table_2, produtoDAO.listaProduto());
					
					}
				else JOptionPane.showMessageDialog(btnAddControle, "Falha ao adicionar produto!");
				
			}
		});
		btnAddControle.setBounds(122, 418, 89, 23);
		controle_panel.add(btnAddControle);
		
		JButton btnRemControle = new JButton("Remover");
		btnRemControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto(textConCod.getText(), 
						  textConDesc.getText(), 
						  textConMed.getText(), 
						  Integer.parseInt(textConQuant.getText()),
						  Float.parseFloat(textConCom.getText()),
						  Float.parseFloat(textConVen.getText()));

				ProdutoDAO produtoDAO = new ProdutoDAO();
				if (produtoDAO.remProduto(produto)) {
				JOptionPane.showMessageDialog(btnAddControle, "Produto removido!");
				tableUpdate(table_2, produtoDAO.listaProduto());

				}
				else JOptionPane.showMessageDialog(btnAddControle, "Falha ao remover produto!");
			}
		});
		btnRemControle.setBounds(221, 418, 89, 23);
		controle_panel.add(btnRemControle);
		
		JButton btnAtuControle = new JButton("Atualizar");
		btnAtuControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto(textConCod.getText(), 
						  textConDesc.getText(), 
						  textConMed.getText(), 
						  Integer.parseInt(textConQuant.getText()),
						  Float.parseFloat(textConCom.getText()),
						  Float.parseFloat(textConVen.getText()));

				ProdutoDAO produtoDAO = new ProdutoDAO();
				if (produtoDAO.atuProduto(produto)) {
				JOptionPane.showMessageDialog(btnAddControle, "Produto Atualizado!");
				tableUpdate(table_2, produtoDAO.listaProduto());

				}
				else JOptionPane.showMessageDialog(btnAddControle, "Falha ao atualizar produto!");
			}
		});
		btnAtuControle.setBounds(320, 418, 89, 23);
		controle_panel.add(btnAtuControle);
		
		JButton btnFinalizarVenda = new JButton("Finalizar");
		btnFinalizarVenda.setBounds(651, 446, 89, 44);
		venda_panel.add(btnFinalizarVenda);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnLoginButton, "Até mais "+usuario.getNome());
				CardLayout cl = (CardLayout)(frmMercadinhoArrochado.getContentPane().getLayout());
				usuario = null;
			    cl.show(frmMercadinhoArrochado.getContentPane(), "login_panel");
			}
		});
		btnLogout.setBounds(10, 527, 83, 23);
		menu_panel.add(btnLogout);
		
		JButton btnCompra = new JButton("Compra ");
		btnCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2 = (CardLayout)(group_panel.getLayout());
			    c2.show(group_panel, "compra_panel");
			}
		});
		btnCompra.setBounds(643, 527, 131, 23);
		menu_panel.add(btnCompra);
		
		JButton btnVenda = new JButton("Venda ");
		btnVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2 = (CardLayout)(group_panel.getLayout());
			    c2.show(group_panel, "venda_panel");
			    
			    ProdutoDAO produtoDAO = new ProdutoDAO();
				tableUpdate(table_2, produtoDAO .listaProduto());
			}
		});
		btnVenda.setBounds(103, 527, 123, 23);
		menu_panel.add(btnVenda);
		
		JButton btnControleEstoque = new JButton("Controle");
		btnControleEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2 = (CardLayout)(group_panel.getLayout());
			    c2.show(group_panel, "controle_panel");
			    ProdutoDAO produtoDAO = new ProdutoDAO();
			    tableUpdate(table_2, produtoDAO.listaProduto());
			}
		});
		btnControleEstoque.setBounds(502, 527, 131, 23);
		menu_panel.add(btnControleEstoque);
		
		JButton btnRelatorio = new JButton("Relatório");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2 = (CardLayout)(group_panel.getLayout());
			    c2.show(group_panel, "relatorio_panel");
			}
		});
		btnRelatorio.setBounds(377, 527, 115, 23);
		menu_panel.add(btnRelatorio);
		
		JButton btnPesquisa = new JButton("Pesquisar");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2 = (CardLayout)(group_panel.getLayout());
			    c2.show(group_panel, "pesquisa_panel");
			    ProdutoDAO produtoDAO = new ProdutoDAO();
			    tableUpdate(table_1, produtoDAO.listaProduto());
			}
		});
		btnPesquisa.setBounds(236, 527, 131, 23);
		menu_panel.add(btnPesquisa);
		
		JButton btnAddVenda = new JButton("Adicionar");
		btnAddVenda.setBounds(651, 38, 89, 23);
		venda_panel.add(btnAddVenda);
	}
}
