//Faça um programa que leia um número positivo impar N e imprima todos os números impar de 1 até N em ordem crecente.

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Digite um número positivo: ");
        } else {
            System.out.println("Os números impares na crecente são: ");

            for (int i = 1; i <= numero; i += 2) {
                System.out.println(i);
            }
        }
    }
}