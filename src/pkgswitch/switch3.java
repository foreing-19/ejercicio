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
public class switch3 {
     public static void main(String[]args){
         System.out.println("elige un número:");
          Scanner sw=new Scanner (System.in);
          
         int otro;
         double num1;
       
         System.out.print("Introduzca un número:");
         num1=sw.nextDouble();
         System.out.println("elige una opcion: 1-raíz cuadrada,2-potencia,3-coseno,4-número absoluto,5-round,6-ceil");
         otro=sw.nextInt();
         
         switch(otro){
             //raíz cuadrada
             case 1: System.out.print("la raíz cuadrada "+Math.sqrt(num1));
             break;
             //potencia
              case 2: System.out.print("la potencia  "+Math.pow(num1,num1));
              break;
              //coseno
              case 3: System.out.print("el coseno  "+Math.cos(num1));
              break;
              //número absoluto
               case 4: System.out.print("el número absoluto  "+Math.abs(num1));
               break;
               //round
               case 5: System.out.print("round "+Math.round(num1));
               break;
               //ceil
               case 6: System.out.print("ceil "+Math.ceil(num1));
               break;
               
               default:System.out.println("ERROR: DATO INVÁLIDO");             
         }    
     }
}
