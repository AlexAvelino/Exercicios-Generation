package ExerciciosJava0505;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		System.out.println("Valor de a: ");
		a = ler.nextDouble();
		System.out.println("Valor de b: ");
		b = ler.nextDouble();
		System.out.println("Valor de c: ");
		c = ler.nextDouble();
		System.out.println("Valor de d: ");
		d = ler.nextDouble();
		System.out.println("Valor de e: ");
		e = ler.nextDouble();
		System.out.println("Valor de f: ");
		f = ler.nextDouble();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		System.out.printf("O valor de X é %lf e o de y é %lf", x, y);
		ler.close();
	}
}
