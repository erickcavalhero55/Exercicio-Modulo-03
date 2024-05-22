//Faça um programa que leia um número positivo par N e imprima todos os números pares de 0 até N em ordem decrecente.

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i += 2){
            System.out.println(i);
        }
    }
}
