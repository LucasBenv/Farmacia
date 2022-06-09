package Swing.Cliente;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ClienteCadastro extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Create the frame //
	public ClienteCadastro() throws Exception {
		setResizable(false);
		
		String title = "Farmacias LP v" + serialVersionUID;  
		setTitle( title );
		
		//setIconImage( Toolkit.getDefaultToolkit().getImage( -- ) );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 218);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
	}
}
