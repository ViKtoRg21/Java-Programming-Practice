/**
 * O programa deve solicitar ao usuário que insira um número inteiro.
  *O programa deve verificar se o número informado é par ou ímpar.
  *Se o número for par, o programa deve exibir a mensagem: "É um número par."
  *Se o número for ímpar, o programa deve exibir a mensagem: "É um número ímpar."
 */
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    if (numero % 2 == 0){
        System.out.print("É um número par." + numero);
    }else
        System.out.print("É um número ímpar.");
    }
}