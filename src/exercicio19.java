//Escreva um algoritmo que leia um número inteiro entre 100 a 999 e imprima na saida cada um dos algarismo que compõem o número.

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro entre 100 e 999
        System.out.print("Insira um número inteiro entre 100 e 999: ");
        int numero = scanner.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("Por favor, insira um número válido entre 100 e 999.");
        } else {
            // Extrai cada algarismo do número
            int centenas = numero / 100;
            int dezenas = (numero / 10) % 10;
            int unidades = numero % 10;

            // Imprime cada algarismo
            System.out.println("Algarismos do número " + numero + ":");
            System.out.println("Centenas: " + centenas);
            System.out.println("Dezenas: " + dezenas);
            System.out.println("Unidades: " + unidades);
        }

        scanner.close();
    }
}