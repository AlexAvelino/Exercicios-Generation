package ExerciciosJava0505;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		 int anos, meses, dias, anoDias;
		 System.out.println("Sua idade em dias: ");
		 anoDias = ler.nextInt();
		 
		 anos = anoDias/365;
		 meses = ((anoDias % 365)/30);
		 dias = ((anoDias % 365)%30);
		 
		 System.out.printf("Você tem %d anos %d meses e %d dias de vida", anos, meses, dias);
		 ler.close();
	}
}
