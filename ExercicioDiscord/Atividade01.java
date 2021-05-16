package ExercicioDiscord;

//1-	Faça um programa que receba três inteiros e diga qual deles é o maior

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3, maior = 0;
		System.out.println("Digite 3 valores e descubra qual deles é o maior");
		System.out.println("Primeiro número: ");
		numero1 = ler.nextInt();
		System.out.println("Segundo número: ");
		numero2 = ler.nextInt();
		System.out.println("Terceiro número: ");
		numero3 = ler.nextInt();
		ler.close();
		if(numero1 > numero2 && numero1 > numero3) {
			maior = numero1;
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			maior = numero2;
		}
		else if(numero3 > numero1 && numero3 > numero2) {
			maior = numero3;
		}
		else {
			System.out.println("Todos os números são iguais!!");
			return;
		}
		System.out.printf("O maior valor é %d", maior);
	}
}
