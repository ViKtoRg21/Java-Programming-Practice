/*
4. Tabuada
Problema: Faça um programa que gere a tabuada de um número fornecido pelo usuário, de 1 a 10.
 */
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número para ver sua tabuada: ");
    int numero = scanner.nextInt();

    for (int i = 1; i <= 10; i++){
        System.out.println("X" + i + "=" + (numero * 1));

        }
    }
}
