package LaçosJava;

import java.util.Scanner;

/* 5-Crie um programa que leia um número do teclado até que encontre um número 
igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/

public class Atividade05DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero,soma = 0;
		
		System.out.println("Digite 0 para Sair");
		
		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			soma += numero;
		}while(numero != 0);
		
		System.out.printf("A soma total dos números digitados foi igual a %d", soma);
		ler.close();
	}
}
