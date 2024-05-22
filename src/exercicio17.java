//Faça um programa que leia um número inteiro positivo N e calcule a soma dos N primeiros números naturais.

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int N = scanner.nextInt();


        if (N <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {

            int soma = 0;
            for (int i = 1; i <= N; i++) {
                soma += i;
            }


            System.out.println("A soma dos primeiros " + N + " números naturais é: " + soma);
        }

        scanner.close();
    }
}
