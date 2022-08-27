//Cálculo para IMC.

package questions;
import java.util.Scanner;


public class q2 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga seu peso: ");
        float peso = sc.nextFloat();
        System.out.println("Diga sua altura:");
        float altura = sc.nextFloat();
        
        float IMC = peso / (altura * altura);
        
        System.out.println("O valor do seu IMC e: " + IMC);  
    }
}
