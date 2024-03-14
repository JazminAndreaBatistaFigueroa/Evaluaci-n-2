/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA2_9_VOLADO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
       Scanner captu = new Scanner (System.in);
        System.out.println("Deseas elegir el numero 1 o 2?");
       num1 = captu.nextInt();
 
        if(num1 == 1)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
        if (num1 == 1)
            System.out.println("GANASTE");
        else
            System.out.println("PERDISTE");
    }
    
}
