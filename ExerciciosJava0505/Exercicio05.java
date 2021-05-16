package ExerciciosJava0505;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, media;
		System.out.println("Escreva primeira nota: ");
		n1 = ler.nextDouble();
		System.out.println("Escreva segunda nota: ");
		n2 = ler.nextDouble();
		System.out.println("Escreva terceira nota: ");
		n3 = ler.nextDouble();
		media = (2*n1 + 3*n2 + 5*n3)/(2 + 3 + 5);
		System.out.println(media);
		ler.close();
		}
}
