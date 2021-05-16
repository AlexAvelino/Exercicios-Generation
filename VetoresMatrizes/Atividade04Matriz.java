package VetoresMatrizes;

import java.util.Scanner;

/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor 
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
.*/

public class Atividade04Matriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz1 = new int[2][2], matriz2 = new int[2][2], matriz3 = new int[2][2];
		int escolha = 0, l, c, constante;
		
		for(l=0; l<=1; l++) {
			for(c=0; c<=1; c++) {
				System.out.printf("Valor da posição %d, %d da primeira matriz: ",l,c);
				matriz1[l][c] = ler.nextInt();
				System.out.printf("Valor da posição %d, %d da segunda matriz: ",l,c);
				matriz2[l][c] = ler.nextInt();
			}
		}
		while(escolha != 5) {
			System.out.println("Escolha uma opção: ");
			System.out.println("1) Somar as duas matrizes");
			System.out.println("2) Subtrair a primeira matriz da segunda");
			System.out.println("3) Adicionar uma constante as duas matizes");
			System.out.println("4) Imprimir as matrizes");
			System.out.println("5) Para sair");
			escolha = ler.nextInt();
			
			switch(escolha) {
			
			case 1:
				for(l=0; l<=1; l++) {
					for(c=0; c<=1; c++) {
						matriz3[l][c]= matriz1[l][c] + matriz2[l][c];
						System.out.print(matriz3[l][c] + "| ");
					}
					System.out.println();
				}
			break;
			
			case 2:
				for(l=0; l<=1; l++) {
					for(c=0; c<=1; c++) {
						matriz3[l][c]= matriz1[l][c] - matriz2[l][c];
						System.out.print(matriz3[l][c] + "| ");
					}
					System.out.println();
				}
			break;
			
			case 3:
				System.out.println("Digite o valor da constante: ");
				constante = ler.nextInt();
				for(l=0; l<=1; l++) {
					for(c=0; c<=1; c++) {
						matriz1[l][c] += constante;
						System.out.print(matriz1[l][c] + "| ");
					}
					System.out.println();
				}
				for(l=0; l<=1; l++) {
					for(c=0; c<=1; c++) {
						matriz2[l][c] += constante;
						System.out.print(matriz2[l][c] + "| ");
					}
					System.out.println();
				}
			break;
			
			case 4:
				for(l=0; l<=1; l++) {
					for(c=0; c<=1; c++) {
						System.out.print(matriz1[l][c] + "| ");
					}
					System.out.println();
				}
				for(l=0; l<=1; l++) {
					for(c=0; c<=1; c++) {
						System.out.print(matriz2[l][c] + "| ");
					}
					System.out.println();
				}
			break;
			
			case 5:
				System.out.println("Saindo do programa...");
			break;
			
			default:
				System.out.println("Opção inválida!");
			break;
				
			}
		}
		ler.close();
	}
	
}
