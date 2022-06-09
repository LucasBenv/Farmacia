package Classes;

import java.util.Date;

public class estoque {

	private int idMedicamento;
	private int quantidade;
	private String unidade;
	
	public estoque(int idMedicamento, int quantidade, String unidade) {
		this.idMedicamento = idMedicamento;
		this.quantidade = quantidade;
		this.unidade = unidade;
	}
	
	public int getIdMedicamento() {
		return idMedicamento;
	}
	
	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getUnidade() {
		return unidade;
	}
	
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}	
	
}
