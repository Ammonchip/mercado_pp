import java.awt.EventQueue;

/**
 * Launch the application.
 */
public class Mercado_Main {
	
	
	
	public static void main(String[] args) {
		
		BancoDeDados.Inicializa();
		
		
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
