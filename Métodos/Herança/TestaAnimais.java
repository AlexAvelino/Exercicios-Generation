package Heran�a;

public class TestaAnimais {
	
	public static void main(String[] args) {
		dog dog1 = new dog();
		Cavalo horse = new Cavalo();
		Pregui�a sloth = new Pregui�a();
		
		dog1.setNome("Jellybean");
		dog1.setSom("Latir");
		dog1.setIdade(2);
		dog1.setAcao("Correndo");
		dog1.setRaca("poodle");
		
		horse.setNome("Veloz");
		horse.setSom("Relinchar");
		horse.setIdade(4);
		horse.setAcao("Correndo");
		
		sloth.setNome("Flash");
		sloth.setSom("zzzzzzzz");
		sloth.setIdade(2);
		sloth.setEscalar("Essssscalaaaaando a arvoreeeeeeeeeeee");
		
		System.err.println("==============Cachorrro===================");
		
		System.out.println("Nome do cachorro: " + dog1.getNome());
		System.out.println("Ra�a do cachorro: " + dog1.getRaca());
		System.out.println("Som: " + dog1.getSom());
		System.out.println("Idade: " + dog1.getIdade());
		System.out.println("A��o: " + dog1.getAcao());
		
		System.err.println("===============Cavalo==================");
		
		System.out.println("Nome do cavalo: " + horse.getNome());
		System.out.println("Som: " + horse.getSom());
		System.out.println("Idade: " + horse.getIdade());
		System.out.println("A��o: " + horse.getAcao());
		
		System.err.println("==============Pregui�a===================");
		
		System.out.println("Nome da pregui�a: " + sloth.getNome());
		System.out.println("Som: " + sloth.getSom());
		System.out.println("Idade: " + sloth.getIdade());
		System.out.println("A��o: " + sloth.getAcao());
	}
}
