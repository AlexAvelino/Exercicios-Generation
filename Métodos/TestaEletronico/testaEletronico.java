package TestaEletronico;

public class testaEletronico {

	public static void main(String[] args) {
		Eletronico cel1 = new Eletronico();
		cel1.setNome("Motorola");
		cel1.setModelo("Moto G");
		cel1.setCodigo(012453626);
		cel1.setCor("Amarelo");
		
		System.out.println("Marca: " + cel1.getNome());
		System.out.println("Moedelo: " + cel1.getModelo());
		System.out.println("Cor: " + cel1.getCor());
		System.out.println("Código do produto: " + cel1.getCodigo());
		
	}
}
