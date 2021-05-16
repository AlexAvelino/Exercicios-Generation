package TestaCliente;

public class Cliente {

	private String nome;
	private int idade;
	private int telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	 void identificacao(){
	        System.out.println("===============================");
	        System.out.println("Nome: " + nome);
	        System.out.println("idade: " + idade);
	        System.out.println("Forma de pagamento: " + telefone);
	        System.out.println("===============================");
	 }
	
	
}
