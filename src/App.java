// Nome: Bernardo Andrade de Castro
// Matrícula: 1261949045

import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite o primeiro lado da piramide: ");
        int ladoA = entrada.nextInt();

        System.out.print("digite o segundo lado da piramide: ");
        int ladoB = entrada.nextInt();

        System.out.print("digite o terceiro lado da piramide: ");
        int ladoC = entrada.nextInt();


        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.print("essa é uma piramide equilatero.");
        }
            else if (ladoA != ladoB && ladoB != ladoC) {
                System.out.print("essa é uma piramide escaleno. ");
                
             } 
             else {
                System.out.print("essa é uma piramide isosceles. ");
                
            }
            
        
        entrada.close();
    }
}
