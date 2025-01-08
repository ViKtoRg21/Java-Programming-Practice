/**
 01) Faça um programa que recebe um número do teclado e calcula o dobro utilizando um
 método.
 **/
import java.util.Scanner;

public class CalculaDobro{
    public static void main (String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int numero = ler.nextInt();

    int resultado = numero * 2;
    System.out.println("O numero é" + resultado);

    }
}