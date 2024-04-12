/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class kajsd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el año a evaluar:");
        ano = captu.nextInt();
        
        if (ano % 100 !=0){
            if(ano % 4 == 0)
                System.out.println("Bisiesto");
            else
                System.out.println("No Bisiesto");
        } if(ano % 400 == 0)
                System.out.println("bisiesto");
           
        
    }
    
}
