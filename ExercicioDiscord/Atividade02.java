package ExercicioDiscord;

//2-	Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int a, b, c, maior1, maior2, maior3; // as variáveis maior representarão nossa ordem (maior1 < maior2 < maior3)
        
        System.out.println("Insira os três números que deseja ordenar:");
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        ler.close();
        
        maior2 = a; //a é colocado como o valor do meio(maior2) para ser um pivô de nossa ordenação
        
        if(b <= maior2) { // caso b seja menor ou igual que maior2, maior1 recebe b
            maior1 = b;
        } else { // caso b seja maior que maior2, maior1 recebe maior2 e maior2 recebe b 
            maior1 = maior2;
            maior2 = b;
        }
        
        if(c >= maior2) { // caso c seja maior ou igual a maior2, maior3 recebe c
            maior3 = c;
        } else { //caso c seja menor que maior2, maior3 recebe maior2 e maior2 recebe c
            maior3 = maior2;
            maior2 = c;
            if(maior2 < maior1) {// caso maior2, isto é c, seja menor que maior 1, maior2 recebe maior1 e maior1 recebe c
                maior2 = maior1;
                maior1 = c;
            }
        }
        
        System.out.println("A ordem crescente dos números inseridos é: " + maior1 + " " + maior2 +
                            " " + maior3);
        
    }
    
} 
