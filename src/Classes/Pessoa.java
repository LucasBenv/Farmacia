package Classes;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String CPF;
	private String rg;
	private Date dataNascimento;
	private String email;
	private int telefone;
	private char sexo;
	
	public Pessoa(String nome, String cPF, String rg, Date dataNascimento, String email, int telefone, char sexo) {
		this.nome = nome;
		this.CPF = cPF;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}
