//Leitura de dois números inteiros e imprima no console qual número
// ́e o maior, se o primeiro ou o segundo.

package questions;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o priemiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número é maior que o segundo.");

        } else if (num2 > num1) {
            System.out.println("O segundo número é maior do que o primeiro.");

        } else {
            System.out.println("Ambos são iguais.");
        }

    }
}
