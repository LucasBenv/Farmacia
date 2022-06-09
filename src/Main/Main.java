package Main;

import java.awt.EventQueue;

import Classes.Cliente;
import Swing.Cliente.ClienteCadastro;

public class Main {
	public static final String serialVersionUID = "1.0.0";
	
	// Launch the application //
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
