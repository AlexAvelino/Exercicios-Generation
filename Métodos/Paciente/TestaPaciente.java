package Paciente;

public class TestaPaciente {

	public static void main(String[] args) {
		Paciente pac1 = new Paciente();
		pac1.setNome("Lucas");
		pac1.setDoen�a("Gripe");
		pac1.setId(0011234);
		
		System.out.println("Nome do paciente " + pac1.getNome());
		System.out.println("Problema de sa�de " + pac1.getDoen�a());
		System.out.println("Numero de cadastro " + pac1.getId());
	}
}
