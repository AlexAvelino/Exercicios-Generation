package ContaBancaria;

public class TestaConta {

	public static void main(String[] args) {
		Conta novaconta = new Conta();
		novaconta.setNome("Carlos");
		novaconta.setNumero(334520168);
		novaconta.setSaldo(42.00);
		
		System.out.println("Nome do propriet�rio da conta: " + novaconta.getNome());
		System.out.println("N�mero da conta " + novaconta.getNumero());
		System.out.println("Saldo: " + novaconta.getSaldo());
	}
}
