/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int calif;
    Scanner captu = new Scanner(System.in);
    System.out.println("Introduce la calificacion de 0 - 100 :");
    calif = captu.nextInt();
    
    if (calif >= 90 && calif <= 100) //Si hay mas de una instruccion, poner llaves}
        System.out.println("A");
    else
        if (calif >= 80 && calif <= 89)
            System.out.println("B");
        else if (calif >= 70 && calif <= 79)
            System.out.println("C");
        else if (calif >= 60 && calif <= 69)
            System.out.println("D");
        else if (calif >= 0 && calif <= 59)
            System.out.println("F");
                 
        
      
    else
            System.out.println("Calificacion no valida");
        
    
    
    }
    
}
