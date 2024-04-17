/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A GENERAR UN ACCESO POR USUARIO Y CONTRASEÑA
        String usuario, pwd;
        
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        
        Scanner captu = new Scanner(System.in);
        
        //Como es un control de acceso, debemos preguntar un numero indetermiado de veces
        //hasta que el usuario y contraseña sean correctos
        while(true){
            System.out.println("Usuario:");
            usuario = captu.nextLine();
            System.out.println("Contraseña:");
            pwd = captu.nextLine();
            if(usuario.equals(USUARIO) && pwd.equals(PASSWORD))//USUARIO CORRECTO
                break;
            else
                System.out.println("Datos incorrectos!!");
        }
        System.out.println("Bienvenido al sistema!!");
        
        
    }
    
}
