package VetoresMatrizes;

import java.util.Scanner;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class Atividade03Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int cont = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				matriz[l][c]=ler.nextInt();
				if(matriz[l][c] > 10) {
					cont++;
				}
			}
		}
		System.out.printf("Essa matriz possui %d valores maiores que 10", cont);
		ler.close();
	}
}
