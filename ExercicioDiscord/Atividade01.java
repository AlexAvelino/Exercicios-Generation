package ExercicioDiscord;

//1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3, maior = 0;
		System.out.println("Digite 3 valores e descubra qual deles � o maior");
		System.out.println("Primeiro n�mero: ");
		numero1 = ler.nextInt();
		System.out.println("Segundo n�mero: ");
		numero2 = ler.nextInt();
		System.out.println("Terceiro n�mero: ");
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
			System.out.println("Todos os n�meros s�o iguais!!");
			return;
		}
		System.out.printf("O maior valor � %d", maior);
	}
}
