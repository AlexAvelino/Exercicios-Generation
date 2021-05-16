package LaçosJava;

/* 4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.*/

import java.util.Scanner;

public class Atividade04While {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, opcoes;
		int contador = 1, calmo = 0, outrosCalmo=0, calmo18=0, mNervosa=0, hAgressivo = 0, nervoso40 = 0;;
		
		while(contador <= 150) {
			
			System.out.println("Pesquisa Psicologica");
			System.out.printf("Idade da %d pessoa:", contador);
			idade = ler.nextInt();
			
			System.out.println("Aperte"
					+ "\n1) Feminino"
					+ "\n2) Masculino"
					+ "\n3) Outro");
			sexo = ler.nextInt();
			
			System.out.println("Digite"
					+ "\n1) Se a pessoa for calma"
					+ "\n2) Se a pessoa for nervosa"
					+ "\n3) Se a pessoa for agressiva");
			opcoes = ler.nextInt();
			
			if(opcoes == 1) {
				calmo++;
				if(sexo == 3) {
					outrosCalmo++;
				}
				if(idade < 18) {
					calmo18 ++;
				}
			}
			if(opcoes == 2 && sexo ==1) {
				mNervosa++;
			}
			else if(opcoes == 3 && sexo == 2) {
				hAgressivo++;
			}
			else if(opcoes == 2 && idade > 40) {
				nervoso40++;
			}
			contador ++;
		}
		System.out.printf("Numero de pessoas calmas: %d"
				+ "\nNúmero de mulheres nervosas: %d"
				+ "\nNúmero de homens agressivos: %d"
				+ "\nNúmero de outros calmos: %d"
				+ "\nNúmero de pessoas nervosas com mais de 40 anos: %d"
				+ "\nNúmero de pessoas calmas com menos de 18 anos: %d", calmo, mNervosa, hAgressivo, outrosCalmo, nervoso40, calmo18);
		ler.close();
		
	}
}
