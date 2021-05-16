package ExercicioDiscord;

//2-	Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int a, b, c, maior1, maior2, maior3; // as vari�veis maior representar�o nossa ordem (maior1 < maior2 < maior3)
        
        System.out.println("Insira os tr�s n�meros que deseja ordenar:");
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        ler.close();
        
        maior2 = a; //a � colocado como o valor do meio(maior2) para ser um piv� de nossa ordena��o
        
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
            if(maior2 < maior1) {// caso maior2, isto � c, seja menor que maior 1, maior2 recebe maior1 e maior1 recebe c
                maior2 = maior1;
                maior1 = c;
            }
        }
        
        System.out.println("A ordem crescente dos n�meros inseridos �: " + maior1 + " " + maior2 +
                            " " + maior3);
        
    }
    
} 
