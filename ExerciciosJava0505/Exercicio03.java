package ExerciciosJava0505;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int segs, hora, minuto, segundos;
		System.out.println("Duração do evento em segundos: ");
		segs = ler.nextInt();
		
		hora = (segs/3600);
		minuto = ((segs%3600)/60);
		segundos = ((segs%3600)%60);
		
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos!", hora, minuto, segundos);
		ler.close();
	}

}
