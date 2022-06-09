package Swing.Cliente;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import BancoDeDados.Database;

public class ClienteConsulta  extends JDialog{

	
	private static final long serialVersionUID = 1L;
	private Database database;
	Statement statement;
	ResultSet resultSet; 
	private String sql_query;
	private int numberRegisters;
	private int registerCurrent;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldId;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldRG;
	private JTextField textFieldDataNascimento;
	private JTextField textFieldEmail;
	private JTextField textFieldTelefone;
	private JTextField textFieldSexo;
	private JTextField textFieldDataCadastro;
	
	private JLabel labelTextoRegistros;
	
	
	public ClienteConsulta() {
		setBounds(100, 100, 530, 525);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] {97, 97, 97, 97, 0};
		gbl_contentPanel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPanel.setLayout(gbl_contentPanel);
		
		JLabel labelId = new JLabel("ID:");
		GridBagConstraints gbc_labelId = new GridBagConstraints();
		gbc_labelId.anchor = GridBagConstraints.EAST;
		gbc_labelId.fill = GridBagConstraints.VERTICAL;
		gbc_labelId.insets = new Insets(0, 5, 5, 5);
		gbc_labelId.gridx = 0;
		gbc_labelId.gridy = 0;
		contentPanel.add(labelId, gbc_labelId);
		
		textFieldId = new JTextField();
		textFieldId.setEnabled(false);
		GridBagConstraints gbc_textFieldId = new GridBagConstraints();
		gbc_textFieldId.gridwidth = 2;
		gbc_textFieldId.fill = GridBagConstraints.BOTH;
		gbc_textFieldId.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldId.gridx = 1;
		gbc_textFieldId.gridy = 0;
		contentPanel.add(textFieldId, gbc_textFieldId);
		textFieldId.setColumns(4);
		
		JLabel labelNome = new JLabel("Nome:");
		GridBagConstraints gbc_labelNome = new GridBagConstraints();
		gbc_labelNome.anchor = GridBagConstraints.EAST;
		gbc_labelNome.fill = GridBagConstraints.VERTICAL;
		gbc_labelNome.insets = new Insets(0, 5, 5, 5);
		gbc_labelNome.gridx = 0;
		gbc_labelNome.gridy = 1;
		contentPanel.add(labelNome, gbc_labelNome);
		
		textFieldNome = new JTextField();
		GridBagConstraints gbc_textFieldNome = new GridBagConstraints();
		gbc_textFieldNome.gridwidth = 2;
		gbc_textFieldNome.fill = GridBagConstraints.BOTH;
		gbc_textFieldNome.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNome.gridx = 1;
		gbc_textFieldNome.gridy = 1;
		contentPanel.add(textFieldNome, gbc_textFieldNome);
		textFieldNome.setColumns(4);
		
		JLabel labelCpf = new JLabel("CPF:");
		GridBagConstraints gbc_labelCPF = new GridBagConstraints();
		gbc_labelCPF.anchor = GridBagConstraints.EAST;
		gbc_labelCPF.fill = GridBagConstraints.VERTICAL;
		gbc_labelCPF.insets = new Insets(0, 5, 5, 5);
		gbc_labelCPF.gridx = 0;
		gbc_labelCPF.gridy = 2;
		contentPanel.add(labelCpf, gbc_labelCPF);
		
		textFieldCPF = new JTextField();
		GridBagConstraints gbc_textFieldCPF = new GridBagConstraints();
		gbc_textFieldCPF.gridwidth = 2;
		gbc_textFieldCPF.fill = GridBagConstraints.BOTH;
		gbc_textFieldCPF.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCPF.gridx = 1;
		gbc_textFieldCPF.gridy = 2;
		contentPanel.add(textFieldCPF, gbc_textFieldCPF);
		textFieldCPF.setColumns(8);
		
		JLabel labelRg = new JLabel("RG:");
		GridBagConstraints gbc_labelRg = new GridBagConstraints();
		gbc_labelRg.anchor = GridBagConstraints.EAST;
		gbc_labelRg.fill = GridBagConstraints.VERTICAL;
		gbc_labelRg.insets = new Insets(0, 5, 5, 5);
		gbc_labelRg.gridx = 0;
		gbc_labelRg.gridy = 3;
		contentPanel.add(labelRg, gbc_labelRg);
		
		textFieldRG = new JTextField();
		GridBagConstraints gbc_textFieldRG = new GridBagConstraints();
		gbc_textFieldRG.gridwidth = 2;
		gbc_textFieldRG.fill = GridBagConstraints.BOTH;
		gbc_textFieldRG.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldRG.gridx = 1;
		gbc_textFieldRG.gridy = 3;
		contentPanel.add(textFieldRG, gbc_textFieldRG);
		textFieldRG.setColumns(8);
		
		JLabel labelNasc = new JLabel("Data Nascimento:");
		GridBagConstraints gbc_labelNasc = new GridBagConstraints();
		gbc_labelNasc.anchor = GridBagConstraints.EAST;
		gbc_labelNasc.fill = GridBagConstraints.VERTICAL;
		gbc_labelNasc.insets = new Insets(0, 5, 5, 5);
		gbc_labelNasc.gridx = 0;
		gbc_labelNasc.gridy = 4;
		contentPanel.add(labelNasc, gbc_labelNasc);
		
		textFieldDataNascimento = new JTextField();
		GridBagConstraints gbc_textFieldNasc = new GridBagConstraints();
		gbc_textFieldNasc.gridwidth = 2;
		gbc_textFieldNasc.fill = GridBagConstraints.BOTH;
		gbc_textFieldNasc.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNasc.gridx = 1;
		gbc_textFieldNasc.gridy = 4;
		contentPanel.add(textFieldDataNascimento, gbc_textFieldNasc);
		textFieldDataNascimento.setColumns(8);
		
		JLabel labelEmail = new JLabel("Email:");
		GridBagConstraints gbc_labelEmail = new GridBagConstraints();
		gbc_labelEmail.anchor = GridBagConstraints.EAST;
		gbc_labelEmail.fill = GridBagConstraints.VERTICAL;
		gbc_labelEmail.insets = new Insets(0, 5, 5, 5);
		gbc_labelEmail.gridx = 0;
		gbc_labelEmail.gridy = 5;
		contentPanel.add(labelEmail, gbc_labelEmail);
		
		textFieldEmail = new JTextField();
		GridBagConstraints gbc_textFieldEmail = new GridBagConstraints();
		gbc_textFieldEmail.gridwidth = 2;
		gbc_textFieldEmail.fill = GridBagConstraints.BOTH;
		gbc_textFieldEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmail.gridx = 1;
		gbc_textFieldEmail.gridy = 5;
		contentPanel.add(textFieldEmail, gbc_textFieldEmail);
		textFieldEmail.setColumns(8);
		
		JLabel labelTelefone = new JLabel("Telefone:");
		GridBagConstraints gbc_labelTelefone = new GridBagConstraints();
		gbc_labelTelefone.anchor = GridBagConstraints.EAST;
		gbc_labelTelefone.fill = GridBagConstraints.VERTICAL;
		gbc_labelTelefone.insets = new Insets(0, 5, 5, 5);
		gbc_labelTelefone.gridx = 0;
		gbc_labelTelefone.gridy = 6;
		contentPanel.add(labelTelefone, gbc_labelTelefone);
		
		textFieldTelefone = new JTextField();
		GridBagConstraints gbc_textFieldTelefone = new GridBagConstraints();
		gbc_textFieldTelefone.gridwidth = 2;
		gbc_textFieldTelefone.fill = GridBagConstraints.BOTH;
		gbc_textFieldTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldTelefone.gridx = 1;
		gbc_textFieldTelefone.gridy = 6;
		contentPanel.add(textFieldTelefone, gbc_textFieldTelefone);
		textFieldTelefone.setColumns(8);
		
		JLabel labelSexo = new JLabel("Sexo:");
		GridBagConstraints gbc_labelSexo = new GridBagConstraints();
		gbc_labelSexo.anchor = GridBagConstraints.EAST;
		gbc_labelSexo.fill = GridBagConstraints.VERTICAL;
		gbc_labelSexo.insets = new Insets(0, 5, 5, 5);
		gbc_labelSexo.gridx = 0;
		gbc_labelSexo.gridy = 7;
		contentPanel.add(labelSexo, gbc_labelSexo);
		
		textFieldSexo = new JTextField();
		GridBagConstraints gbc_textFieldSexo = new GridBagConstraints();
		gbc_textFieldSexo.gridwidth = 2;
		gbc_textFieldSexo.fill = GridBagConstraints.BOTH;
		gbc_textFieldSexo.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldSexo.gridx = 1;
		gbc_textFieldSexo.gridy = 7;
		contentPanel.add(textFieldSexo, gbc_textFieldSexo);
		textFieldSexo.setColumns(8);
		
		JLabel labelCad = new JLabel("Data Cadastro:");
		GridBagConstraints gbc_labelCad = new GridBagConstraints();
		gbc_labelCad.anchor = GridBagConstraints.EAST;
		gbc_labelCad.fill = GridBagConstraints.VERTICAL;
		gbc_labelCad.insets = new Insets(0, 5, 5, 5);
		gbc_labelCad.gridx = 0;
		gbc_labelCad.gridy = 8;
		contentPanel.add(labelCad, gbc_labelCad);
		
		textFieldDataCadastro = new JTextField();
		GridBagConstraints gbc_textFieldCad = new GridBagConstraints();
		gbc_textFieldCad.gridwidth = 2;
		gbc_textFieldCad.fill = GridBagConstraints.BOTH;
		gbc_textFieldCad.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCad.gridx = 1;
		gbc_textFieldCad.gridy = 8;
		contentPanel.add(textFieldDataCadastro, gbc_textFieldCad);
		textFieldDataCadastro.setColumns(8);
		

		JPanel panelNavegacao = new JPanel();
		getContentPane().add(panelNavegacao, BorderLayout.CENTER);
		
		labelTextoRegistros = new JLabel("Registro 0 de 0 Registros");
		panelNavegacao.add(labelTextoRegistros);
		
		JButton buttonVoltar = new JButton("Voltar");
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento voltar
				try{
					ClienteConsulta dialog = ClienteConsulta.this;
					
					// exibe os resultados da consulta
					if( (0 < (dialog.registerCurrent-1)) && (dialog.registerCurrent <= dialog.numberRegisters) ) {
						if( dialog.resultSet.previous() ){
							dialog.registerCurrent--;
							dialog.labelTextoRegistros.setText(
													String.format("Registro %d de %d Registros",
															dialog.registerCurrent, dialog.numberRegisters) );
							dialog.atualizarCampos();
						}
					}
				}
				catch( SQLException sqlException ){
					sqlException.printStackTrace();
				}
			}
		});
		
		JButton buttonAvancar = new JButton("Avan\u00E7ar");
		buttonAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento avancar
				try{
					ClienteConsulta dialog = ClienteConsulta.this;
					
					// exibe os resultados da consulta
					if( (1 <= dialog.registerCurrent) && ((dialog.registerCurrent+1) <= dialog.numberRegisters) ) {
						if( dialog.resultSet.next() ){
							dialog.registerCurrent++;
							dialog.labelTextoRegistros.setText(
													String.format("Registro %d de %d Registros",
															dialog.registerCurrent, dialog.numberRegisters) );
							dialog.atualizarCampos();
						}
					}
				}
				catch( SQLException sqlException ){
					sqlException.printStackTrace();
				}
			}
		});
		panelNavegacao.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelNavegacao.add(buttonVoltar);
		panelNavegacao.add(buttonAvancar);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		JButton okButton = new JButton("Sair");
		okButton.setActionCommand("Sair");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
		
		try{
			this.database = Database.getInstance();
			this.statement = database.getConnection().createStatement(
														ResultSet.TYPE_SCROLL_INSENSITIVE,
														ResultSet.CONCUR_UPDATABLE );
			this.sql_query = "SELECT * FROM cliente";
			this.resultSet = statement.executeQuery( this.sql_query );
			
			this.numberRegisters = 0;
			this.registerCurrent = 0;
			
			this.resultSet.last();
			this.numberRegisters = this.resultSet.getRow();
			this.resultSet.beforeFirst();
			
			this.labelTextoRegistros.setText( String.format("Registro %d de %d Registros", this.registerCurrent, this.numberRegisters) );
	
			if( this.numberRegisters > 0 ) {
				// exibe os resultados da consulta
				if( this.resultSet.next() ){
					this.registerCurrent++;
					this.labelTextoRegistros.setText( String.format("Registro %d de %d Registros", this.registerCurrent, this.numberRegisters) );
					this.atualizarCampos();
				}
			}
		}
		catch( SQLException sqlException ){
			sqlException.printStackTrace();
		}
	}
	
	
	
	
	
	private boolean atualizarCampos() {
		try{			
			this.textFieldId.setText( this.resultSet.getObject("id").toString() );
			this.textFieldNome.setText( this.resultSet.getObject("nome").toString() );
			this.textFieldCPF.setText( this.resultSet.getObject("CPF").toString() );
			this.textFieldRG.setText( this.resultSet.getObject("rg").toString() );
			this.textFieldDataNascimento.setText( this.resultSet.getObject("dataNascimento").toString() );
			this.textFieldEmail.setText( this.resultSet.getObject("email").toString() );
			this.textFieldTelefone.setText( this.resultSet.getObject("telefone").toString() );
			this.textFieldSexo.setText( this.resultSet.getObject("sexo").toString() );
			this.textFieldDataCadastro.setText( this.resultSet.getObject("dataCadastro").toString() );
			return true;
		}
		catch( SQLException sqlException ){
			sqlException.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	
	
}
