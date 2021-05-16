package LaçosJava;

import java.util.Scanner;

/* 6-Escrever um programa que receba vários números inteiros no teclado. E no final 
imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

public class Atividade06DoWhile {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int numero, media = 0, cont = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			if(numero % 3 == 0);{
				media += numero;
				cont++;
			}
		}while(numero !=0);
		
		media = media/cont;
		System.out.printf("A média dos números múltiplos 3 é igual a %d", media);
		System.out.println("\n" + cont);
		ler.close();
	}

}
