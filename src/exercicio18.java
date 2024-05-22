//Escreva um algoritmo que leia certa quantidade de números e imprima o maior deles e qantas vezes o maior número foi lido.
//A quantidade de números a serem lidos deve ser fornecida pelo usuario.

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicita ao usuário a quantidade de números a serem lidos
        System.out.print("Quantos números deseja inserir? ");
        int quantidadeNumeros = scanner.nextInt();

        if (quantidadeNumeros <= 0) {
            System.out.println("Por favor, insira uma quantidade válida de números.");
        } else {
            int maiorNumero = Integer.MIN_VALUE; // Inicializa o maior número como o menor valor possível
            int contadorMaiorNumero = 0; // Contador para contar quantas vezes o maior número foi lido

            // Lê os números e encontra o maior
            for (int i = 1; i <= quantidadeNumeros; i++) {
                System.out.print("Insira o " + i + "º número: ");
                int numero = scanner.nextInt();

                if (numero > maiorNumero) {
                    maiorNumero = numero;
                    contadorMaiorNumero = 1; // Reinicia o contador se um novo maior número é encontrado
                } else if (numero == maiorNumero) {
                    contadorMaiorNumero++; // Incrementa o contador se o mesmo maior número é lido novamente
                }
            }

            // Imprime o maior número e quantas vezes ele foi lido
            System.out.println("O maior número inserido foi: " + maiorNumero);
            System.out.println("Ele foi lido " + contadorMaiorNumero + " vez(es).");
        }

        scanner.close();
    }
}


