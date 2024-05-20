//Faça um programa que calcule e mostre a soma dos 50 primeiros numeros pares

public class exercicio10 {
    public static void main(String[] args) {
        int soma = 0;


        for (int i = 1; i <= 50; i++) {
            soma += 2 * i;
        }

        // Exibe o resultado
        System.out.println("A soma dos 50 primeiros números pares é: " + soma);
    }

}

