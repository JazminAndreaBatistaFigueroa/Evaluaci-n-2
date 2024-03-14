/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda;
        int adivinar;
        Scanner captu = new Scanner(System.in);
        adivinar = captu.nextInt();
        
        moneda = Math.random();
        System.out.println("El valor de la moneda =" + moneda);
        
        
        if(moneda >0.5 && adivinar == 0)
            System.out.println("Adivinaste, es cara");
        else
            if(moneda > 0.5 && adivinar == 1)
                System.out.println("Adivinaste, es cruz");
        else
                System.out.println("Perdiste");
        
        
    }
    
}
