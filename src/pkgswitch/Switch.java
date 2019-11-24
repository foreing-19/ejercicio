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
public class Switch {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Scanner type=new Scanner(System.in);
          String mes;
       System.out.println("Introduzca un mes: ");
       
       mes=type.nextLine();
       mes=mes.toUpperCase();
       
          switch(mes){
            case "ENERO": System.out.println("has elegido enero");
            break;
            case "FEBRERO": System.out.println("has elegido febrero");
            break;
             case "MARZO": System.out.println("has elegido marzo");
             break;
            case "ABRIL": System.out.println("has elegido abril");
            break;
             case "MAYO": System.out.println("has elegido mayo");
             break;
            case "JUNIO": System.out.println("has elegido junio");
            break;
             case "JULIO": System.out.println("has elegido julio");
             break;
            case "AGOSTO": System.out.println("has elegido agosto");
            break;
             case "SEPTIEMBRE": System.out.println("has elegido septiembre");
             break;
            case "OCTUBRE": System.out.println("has elegido octubre");
            break;
             case "NOVIEMBRE": System.out.println("has elegido noviembre");
             break;
            case "DICIEMBRE": System.out.println("has elegido diciembre");
            break;
            default: System.out.println("Mes no válido");
        }

    
 }   
}

