import java.awt.EventQueue;

/**
 * Launch the application.
 */
public class Mercado_Main {
	
	
	
	public static void main(String[] args) {
		
		BancoDeDados.Inicializa();
		System.out.println("usuario:senha\nadmin:admin\noperador:1234");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MercadoWindow window = new MercadoWindow();
					window.frmMercadinhoArrochado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
