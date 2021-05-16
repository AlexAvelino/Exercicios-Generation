package LaçosJava;

import java.util.Scanner;

// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Atividade02For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, par = 0, impar=0;
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("Digite um número: ");
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
