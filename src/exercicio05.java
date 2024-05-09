//Faça um programa que peça ao usuario para digitar 10 valores e some-os

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 10 valores:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");

            int valor = scanner.nextInt();

            soma += valor;
        }


        scanner.close();

        System.out.println("A soma dos valores é: " + soma);

    }
}
