package ExerciciosJava0505;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x1, y1, x2, y2, d, p1, p2, somaP;
		System.out.println("Escreva o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.println("Escreva o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.println("Escreva o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.println("Escreva o valor de y2: ");
		y2 = ler.nextDouble();
		
		p1 = Math.pow((x2-x1), 2.0);
		p2 = Math.pow((y2-y1), 2.0);
		somaP = p1 + p2;
		d = Math.sqrt(somaP);
		System.out.println("A distância entre os dois pontos é: "+ d);
		ler.close();
	}
}
