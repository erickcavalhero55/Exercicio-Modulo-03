//Faça um programa que leia 10 inteiros positivos,ignorando não positivos, e imprima sua media.

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um inteiro positivo: ");
            int num = scanner.nextInt();

            if (num > 0) {
                total += num;
                count++;
            }
        }

        if (count > 0) {
            double media = (double) total / count;
            System.out.println("A média dos inteiros positivos é: " + media);
        } else {
            System.out.println("Nenhum inteiro positivo foi inserido.");
        }

        scanner.close();
    }
}

