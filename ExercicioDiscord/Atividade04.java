package ExercicioDiscord;

 /*4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e 
exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada 
do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		ler.close();
		if(numero % 2 == 0) {
			System.out.println("� um numero par");
			System.out.println("Sua raiz quadrada � de " + Math.sqrt(numero));
		}
		else {
			System.out.println("� um n�mero impar");
			System.out.println("E sua pot�ncia elevada ao quadrado � igual a " + Math.pow(numero,2.0));
		}
	}
}
