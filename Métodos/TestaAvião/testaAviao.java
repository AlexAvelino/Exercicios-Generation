package TestaAvião;

public class testaAviao {

	public static void main(String[] args) {
		Aviao plane1 = new Aviao();
		plane1.setModelo("A207");
		plane1.setCompanhia("Azurlane");
		plane1.setCombustivel(20);
		plane1.setDistancia(300);
		
		plane1.liga();
		System.out.println(plane1.decolar());
		System.out.println("modelo: " + plane1.getModelo());
		System.out.println("Companhia de transporte: " + plane1.getCompanhia());
	}
}
