//Faça um programa que leia um número inteiro N e imprima todos os números naturais de 0 ate N em ordem crescente

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println(i);

        }
        scanner.close();

    }
}