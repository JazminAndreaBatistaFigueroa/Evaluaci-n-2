/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3_;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA2_20_FOR_3_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje;
        int cant;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es el mensaje que deseas transmitir:");
        mensaje = captu.nextLine();
        System.out.println("Cuantas veces quieres que imprima el mensaje:");
        cant = captu.nextInt();
        
        for (int i = 1; i <= cant; i++) {
                System.out.println(mensaje);
        }
        System.out.println("");
        //Imprimir la sumatoria de un numero
        //solicitar numero entero, calcular la sumatoria,, Ejem: El usuario introduce un 5, calcular
        //1+2+3+4+5
        
       int NE;
        int suma = 0;
        System.out.println("Introduce un numero entero ");
        NE = captu.nextInt();
        
        for (int i = 1; i <= NE; i++) {
            suma += i;
            }
        System.out.println("La sumatoria del 1 al " + NE + " es: " + suma);
        //Captura un numero e imprimir una secuencia de *. ejemplo: *,**,***
        System.out.println("");
        int N3;
        
        Scanner scanner = new Scanner (System.in);
        //capturar el numero ingresado por el usuario
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        
        //imprimir la secuencia de asteriscos
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                }
            System.out.println("");
                
            }
            
        }
        
        }
    
    

