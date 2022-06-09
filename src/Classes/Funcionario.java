package Classes;

public class Funcionario {

	private int matricula;
	private String cargo;
	private int PIS;
	
	public Funcionario(int matricula, String cargo, int pIS) {
		this.matricula = matricula;
		this.cargo = cargo;
		PIS = pIS;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getPIS() {
		return PIS;
	}
	
	public void setPIS(int pIS) {
		PIS = pIS;
	}
	
}
