package La�osJava;

import java.util.Scanner;

/* 6-Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final 
imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

public class Atividade06DoWhile {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int numero, media = 0, cont = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			
			if(numero % 3 == 0);{
				media += numero;
				cont++;
			}
		}while(numero !=0);
		
		media = media/cont;
		System.out.printf("A m�dia dos n�meros m�ltiplos 3 � igual a %d", media);
		System.out.println("\n" + cont);
		ler.close();
	}

}
