package ExerciciosJava0505;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, soma, bissexto;
		
		System.out.println("Escreva sua idade em anos, meses e dias");
		System.out.println("Anos: ");
		anos = ler.nextInt();
		System.out.println("Meses: ");
		meses = ler.nextInt();
		System.out.println("Dias: ");
		dias = ler.nextInt();
		bissexto = anos/4;
		soma = bissexto +(anos*365)+(meses*30)+dias;
		System.out.printf("Você já viveu %d dias de vida", soma);
		ler.close();
	}

}
