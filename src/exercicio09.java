//Faça um programa que leia um numero inteiro e depois imprima os primeiros numeros naturais impar

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();


        scanner.close();


        System.out.println("Os primeiros " + n + " números naturais ímpares são:");
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }
    }
}