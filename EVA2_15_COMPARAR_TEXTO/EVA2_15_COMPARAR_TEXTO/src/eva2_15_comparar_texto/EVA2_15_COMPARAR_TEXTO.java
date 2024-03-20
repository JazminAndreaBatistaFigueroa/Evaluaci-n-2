/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA2_15_COMPARAR_TEXTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COMPARAR TEXTO
        String dia;
        int otroDia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el dia (lunes, martes, miercoles etc..)");
        dia = captu.nextLine();
        if(dia.equals("Domingo"))//no podemos comparar cadenas con
            System.out.println("1");
            else if(dia.equals("Lunes"))
            System.out.println("2");
            else if(dia.equals("Martes"))//no podemos comparar cadenas con
            System.out.println("3");
            else if (dia.equals("Miercoles"))
            System.out.println("4");
            else if (dia.equals("Jueves"))
            System.out.println("5");
            else if (dia.equals("Viernes"))
            System.out.println("6");
            else if (dia.equals("Sabado"))
            System.out.println("7");
    }
    
}
