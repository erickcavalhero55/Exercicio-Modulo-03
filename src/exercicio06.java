//Faça um programa que leia 10 inteiros e imprima sua media.

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int soma = 0;

        System.out.println("Digite 10 valores inteiros: ");

        for (int i = 0; i <10 ; i++){
            System.out.println("Digite o valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();

            soma += valor /2;

        }

        scanner.close();

        System.out.println("A media dos valores é: " + soma );
    }
}
