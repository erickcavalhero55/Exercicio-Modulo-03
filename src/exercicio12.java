//Faça um programa que leia um número inteiro positivo N e imprima todos os números naturais de 0 até N em ordem decresente.

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0; i--){
            System.out.println(i);
        }

    }

}
