/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Mouhcine
 */
public class NOTA {
    public static void main(String[]args){
        
        System.out.println("A continuación Introduzca una nota: ");
        Scanner sc=new Scanner (System.in);
        
        int nota;
        System.out.print("la nota es:");
        nota=sc.nextInt();
        
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3: 
            case 4:System.out.println("suspenso");
            break;
            case 5:System.out.println("Suficiente");
            break;
            case 6:System.out.println("Bien");
            break;
            case 7:System.out.println("");
            case 8:System.out.println("Notable");
            break;
            case 9:System.out.println("");
            case 10:System.out.println("Sobresaliente");
            break;
            default: System.out.println("la nota introducida es inválida");
                
        }
        
    }
    
    
}
