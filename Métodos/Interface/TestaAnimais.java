package Interface;

public class TestaAnimais {
	
	public static void main(String[] args) {
		dog dog1 = new dog();
		Cavalo horse = new Cavalo();
		Preguiça sloth = new Preguiça();
		
		dog1.setNome("Jellybean");
		dog1.setSom("Latir");
		dog1.setIdade(2);
		dog1.setRaca("poodle");
		
		horse.setNome("Veloz");
		horse.setSom("Relinchar");
		horse.setIdade(4);
		
		sloth.setNome("Flash");
		sloth.setSom("zzzzzzzz");
		sloth.setIdade(2);
		
		System.out.println("==============Cachorrro===================");
		
		System.out.println("Nome do cachorro: " + dog1.getNome());
		System.out.println("Raça do cachorro: " + dog1.getRaca());
		System.out.println("Som: " + dog1.getSom());
		System.out.println("Idade: " + dog1.getIdade());
		dog1.acao();
		
		System.out.println("===============Cavalo==================");
		
		System.out.println("Nome do cavalo: " + horse.getNome());
		System.out.println("Som: " + horse.getSom());
		System.out.println("Idade: " + horse.getIdade());
		horse.acao();
		System.out.println("==============Preguiça===================");
		
		System.out.println("Nome da preguiça: " + sloth.getNome());
		System.out.println("Som: " + sloth.getSom());
		System.out.println("Idade: " + sloth.getIdade());
		sloth.acao();
	}
}
