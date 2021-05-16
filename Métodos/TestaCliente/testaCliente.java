package TestaCliente;

public class testaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("João Marcelo");
		cliente1.setIdade(22);
		cliente1.setTelefone(999923231);
		
		cliente1.identificacao();
	}
		
}
