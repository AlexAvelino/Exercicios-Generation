package TestaFuncionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Adalberto");
		func.setId(67772435);
		func.setIdade(32);
		func.setSalario(10000);
		
		System.out.println("Nome: " + func.getNome());
		System.out.println("Idade do funcionario: " + func.getIdade());
		System.out.println("ID do funcion�rio: " + func.getId());
		System.out.println("Sal�rio: " + func.getSalario());
	}
}
