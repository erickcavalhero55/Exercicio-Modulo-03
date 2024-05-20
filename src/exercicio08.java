//Faça um programa que leia 10 numeros e escreva o menor valor lido e o maior valor lido

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();


            if (numero < menorValor) {
                menorValor = numero;
            }

            if (numero > maiorValor) {
                maiorValor = numero;
            }
        }


        scanner.close();


        System.out.println("O menor valor lido foi: " + menorValor);
        System.out.println("O maior valor lido foi: " + maiorValor);
    }
}