package VetoresMatrizes;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

public class Atividade02Vetor {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] numero = new int[6];
		
		int somaPar = 0, contImpar = 0;
		
		for(int i=0; i<numero.length; i++) {
			System.out.printf("Digite o %d° número: ", (i+1));
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
		System.out.printf("\nA soma dos numeros pares digitados é igual a %d", somaPar);
		System.out.printf("\nForam digitados %d numeros impares!", contImpar);
		ler.close();
		
	}

}
