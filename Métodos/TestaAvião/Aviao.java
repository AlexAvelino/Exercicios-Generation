package TestaAvião;

public class Aviao {

	private String Modelo;
	private String Companhia;
	private double distancia;
	private double combustivel;
	
	
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getCompanhia() {
		return Companhia;
	}
	public void setCompanhia(String companhia) {
		Companhia = companhia;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	
	void liga(){
		System.out.println("Avião ligado...");
	}
	String decolar() {
		if (distancia - combustivel >= 40) {
			return "Decolagem cancelada por falta de combustivel";
		}
		else {
			return "Decolando";
		}
	}
}
