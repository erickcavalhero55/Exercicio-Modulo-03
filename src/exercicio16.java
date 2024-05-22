//Faça um programa que leia um número positivo impar N e imprima todos os números impar de 1 até N em ordem decrecente.

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 1; i--){
            System.out.println(2 * i + 1);
        }
    }
}
