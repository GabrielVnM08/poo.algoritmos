//Identificar se um número  ́e par ou  ́ımpar.

package questions;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O número é impar.");
            
        }
                
    }
    
}
