package Classes;

public class Medicamento {
		
	private int idMedicamento;
	private String nome;
	private Boolean generico;
	private int miligrama;
	private Float preco;
	private Boolean receita;
	
	public Medicamento(int idMedicamento, String nome, Boolean generico, int miligrama, Float preco, Boolean receita) {
		this.idMedicamento = idMedicamento;
		this.nome = nome;
		this.generico = generico;
		this.miligrama = miligrama;
		this.preco = preco;
		this.receita = receita;
	}
	
	public int getIdMedicamento() {
		return idMedicamento;
	}
	
	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Boolean getGenerico() {
		return generico;
	}
	
	public void setGenerico(Boolean generico) {
		this.generico = generico;
	}
	
	public int getMiligrama() {
		return miligrama;
	}
	
	public void setMiligrama(int miligrama) {
		this.miligrama = miligrama;
	}
	
	public Float getPreco() {
		return preco;
	}
	
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	public Boolean getReceita() {
		return receita;
	}
	
	public void setReceita(Boolean receita) {
		this.receita = receita;
	}
	
}
