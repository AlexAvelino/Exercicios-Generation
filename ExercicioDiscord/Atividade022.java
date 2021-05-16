package ExercicioDiscord;

//2-	Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Atividade022 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3, maior = 0, medio = 0, menor = 0;
		System.out.println("Entre com o primeiro numero: ");
		numero1 = ler.nextInt();
		System.out.println("Entre com o segundo numero: ");
		numero2 = ler.nextInt();
		System.out.println("Entre com o terceiro numero: ");
		numero3 = ler.nextInt();
		ler.close();
		
		if (numero1 > numero2 && numero1 > numero2 && numero2 > numero3) {
			maior = numero1;
			medio = numero2;
			menor = numero3;
		}
		else if(numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
			maior = numero1;
			medio = numero3;
			menor = numero2;
		}
		else if(numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
			maior = numero2;
			medio = numero1;
			menor = numero3;
		}
		else if(numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
			maior = numero2;
			medio = numero3;
			menor = numero1;
		}
		else if(numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
			maior = numero3;
			medio = numero1;
			menor = numero2;
		}
		else if(numero3 > numero1 && numero3 > numero2 && numero2 > numero1) {
			maior = numero3;
			medio = numero2;
			menor = numero1;
		}
		System.out.printf("%d, %d, %d.", menor, medio, maior);
	}
}
