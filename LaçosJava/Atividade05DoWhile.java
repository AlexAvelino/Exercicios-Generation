package La�osJava;

import java.util.Scanner;

/* 5-Crie um programa que leia um n�mero do teclado at� que encontre um n�mero 
igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/

public class Atividade05DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero,soma = 0;
		
		System.out.println("Digite 0 para Sair");
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			soma += numero;
		}while(numero != 0);
		
		System.out.printf("A soma total dos n�meros digitados foi igual a %d", soma);
		ler.close();
	}
}
