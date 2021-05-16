package LaçosJava;

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/

public class Atividade03While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, totalMenos21 = 0, totalMais50 = 0;
		
		System.out.println("Digite -99 Para parar");
		while(idade !=-99) {
			System.out.println("Digite a idade das pessoas: ");
			idade = ler.nextInt();
			if(idade < 21 && idade > 0) {
				totalMenos21 ++;
			}
			if (idade > 50) {
				totalMais50 ++;
			}
		}
		System.out.printf("Total de pessoas com menos de 21 anos é igual a %d e com mais de 50 é de %d", totalMenos21, totalMais50);
		ler.close();
	}
}
