//Escreva um programa que declare um inteiro,incialize-o com 0,e incremente-o de 1000 em 1000,imprimindo seu valor na tela,ate que seu valor seja 100000

public class exercicio04 {
    public static void main(String[] args) {
        int num = 0;

        while (num <= 100000) {
            System.out.println(num);
            num += 1000;

        }
    }
}