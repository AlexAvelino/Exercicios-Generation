package La�osJava;

import java.util.Scanner;

// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Atividade02For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, par = 0, impar=0;
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			
			if(numero%2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("Foram digitados %d numeros pares e %d numeros impares.", par, impar);
		ler.close();
	}
}
