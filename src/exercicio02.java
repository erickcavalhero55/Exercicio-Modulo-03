//Escreva um programa que escreva na tela, de 1 ate 100,de 1 em 1, 3 vezes.A primeira vez deve usar a estrutura for a segunda while e a terceira do while

public class exercicio02 {
    public static void main(String[] args) {
        System.out.println("Usando for:");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


        System.out.println("Usando while:");
        int j = 1;
        while (j <= 100) {
            System.out.println(j);
            j++;
        }


        System.out.println("Usando do-while:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 100);

    }
}
