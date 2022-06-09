package Classes;

import java.util.Date;

public class Venda {

	private int idMedicamento;
	private int quantidade;
	private Date dataVenda;
	
	public Venda(int idMedicamento, int quantidade, Date dataVenda) {
		this.idMedicamento = idMedicamento;
		this.quantidade = quantidade;
		this.dataVenda = dataVenda;
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
	
	public Date getDataVenda() {
		return dataVenda;
	}
	
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
}
