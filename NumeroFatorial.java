/*
6. Cálculo de Fatorial
Problema: Escreva um programa que calcule o fatorial de um número inteiro positivo fornecido pelo usuário.
 */
import java.util.Scanner;

public class NumeroFatorial {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + '\n' + "É " + fatorial);
    }
}
