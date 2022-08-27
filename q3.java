//Cálculo de  ́area de um trapézio retângulo.

package questions;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha com a medida dos estremos do triângulo.");
        
        System.out.println("Base Maior: ");
        float baseM = sc.nextFloat();
        
        System.out.println("Base Menor:");
        float basem = sc.nextFloat();
        
        System.out.println("Altura:");
        float altura = sc.nextFloat();
 
        float area = ((baseM + basem) * altura) / 2;
 
        System.out.println(area);
       
    }
}
