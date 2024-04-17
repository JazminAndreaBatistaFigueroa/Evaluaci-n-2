/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_break_contt;

/**
 *
 * @author jazzb
 */
public class EVA2_25_BREAK_CONTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         for (int i = 0; i < 100; i++) {
            int mod = i % 2;
            if(mod != 0) //CUANDO SE EJECUTA, INTERRUMPE LA INTERACCION ACTUAL
                continue;
            
            System.out.println(i);
            
        }
         System.out.println("BREAK:>>>>>>>>>");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if(i == 50)
                break; //cuando se ejecuta, detiene por completo el ciclo
        }
    }
    
}
