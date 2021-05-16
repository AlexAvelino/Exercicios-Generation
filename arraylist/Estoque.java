package arraylist;

import java.util.ArrayList;

public class Estoque {

	public static void main(String[] args) {
		
		String produto1 = "Mouse";
		String produto2 = "Monitor";
		String produto3 = "Teclado";
		String produto4 = "Gabinete";
		
		ArrayList <String> estoque = new ArrayList<>();
		
		estoque.add(produto1);
		estoque.add(produto2);
		estoque.add(produto3);
		estoque.add(produto4);
		
		for(String l: estoque) {
			System.out.println(l);
		}
		estoque.remove("Gabinete");
		estoque.add(3,"RGB");
		System.out.println(estoque);
		
	}
}
