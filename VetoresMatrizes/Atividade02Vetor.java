package VetoresMatrizes;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/

public class Atividade02Vetor {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] numero = new int[6];
		
		int somaPar = 0, contImpar = 0;
		
		for(int i=0; i<numero.length; i++) {
			System.out.printf("Digite o %d� n�mero: ", (i+1));
			numero[i] = ler.nextInt();
			
			if(numero[i] % 2 ==0) {
				somaPar = somaPar + numero[i];
			}
			else {
				contImpar++;
			}
			
		}
		System.out.println("Numeros pares digitados: ");
		
		for(int i=0; i<numero.length; i++) {
			if(numero[i]%2 == 0) {
				System.out.printf("%d, ", numero[i]);
			}
		}
		
		System.out.println("\nNumeros impares digitados: ");
		
		for(int i=0; i<numero.length; i++) {
			if(numero[i] % 2 != 0) {
				System.out.printf("%d, ", numero[i]);
			}
		}
		System.out.printf("\nA soma dos numeros pares digitados � igual a %d", somaPar);
		System.out.printf("\nForam digitados %d numeros impares!", contImpar);
		ler.close();
		
	}

}
