/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_impar;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA2_7_IMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, divi, resi;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        num = captu.nextInt();
        divi = num / 2;
        System.out.println("Division entera de " + num + " /2 = " + divi );
        resi = num % 2;
        System.out.println("El residuo de " + num + "% 2 = " + resi);
        //NUMERO PAR O IMPAR:
        if (resi == 0)
            System.out.println(num + " Es par");
        else 
            System.out.println(num + " Es impar");
        
    }
    
}
