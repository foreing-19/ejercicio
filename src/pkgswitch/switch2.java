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
public class switch2 {
      public static void main(String[]args){
          System.out.println("elige una de las 3 opciones:");
         Scanner sw=new Scanner (System.in);
         
          String cadena;
          int opcion;
          
          System.out.println("Escribe lo que quieras : ");
          cadena=sw.nextLine();
          System.out.println("elige una opción: 1-longitud,2-mayúscula,3-minúscula:");
          opcion=sw.nextInt();
          
          switch(opcion){
              case 1: System.out.println("longitud "+cadena.length());
              break;
              case 2: System.out.println("Mayúscula "+cadena.toUpperCase());
              break;
              case 3: System.out.println("Minúscula "+cadena.toLowerCase());
              break;
              default: System.out.println("error");
                      
          }   
        }
    }
