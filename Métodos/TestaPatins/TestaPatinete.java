package TestaPatins;

public class TestaPatinete {

	public static void main(String[] args) {
		Patinete patins = new Patinete();
		patins.setMarca("SpeedBall");
		patins.setPreco(128.99);
		patins.setVelocidade(300);
		
		System.out.println("Marca: " + patins.getMarca());
		System.out.println("Preço: " + patins.getPreco());
		System.out.println("Velocidade: " + patins.getVelocidade());
	}
}
