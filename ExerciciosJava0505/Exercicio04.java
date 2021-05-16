package ExerciciosJava0505;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, D, R, S;
		System.out.println("Primeiro numero: ");
		a = ler.nextDouble();
		System.out.println("Segundo numero: ");
		b = ler.nextDouble();
		System.out.println("Terceiro numero: ");
		c = ler.nextDouble();
		R = Math.pow((a+b), 2.0);
		S = Math.pow((b+c), 2.0);
		D = (R+S)/2;
		System.out.println(D);
		ler.close();
	}
}
