//Faça um programa que determine e mostre os cincos primeiros  multiplos de 3,considerando numeros maiores de 0.



public class exercicio01 {
    public static void main(String[] args) {
        int count = 0;

        int num = 1;

        while (count < 5) {

            if (num % 3 == 0) {

                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}