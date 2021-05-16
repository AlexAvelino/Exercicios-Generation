package ExercicioDiscord;

 /*4-	Faça um programa em que permita a entrada de um número qualquer e 
exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada 
do mesmo; se for ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		ler.close();
		if(numero % 2 == 0) {
			System.out.println("É um numero par");
			System.out.println("Sua raiz quadrada é de " + Math.sqrt(numero));
		}
		else {
			System.out.println("É um número impar");
			System.out.println("E sua potência elevada ao quadrado é igual a " + Math.pow(numero,2.0));
		}
	}
}
