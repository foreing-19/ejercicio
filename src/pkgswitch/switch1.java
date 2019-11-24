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
public class switch1 {
    public static void main(String[]args){
        System.out.println("A continuación introduzca 2 números y el programa hara unas operaciones:");
        Scanner sw=new Scanner (System.in);
        double x,y; char operacion;
        
        
        System.out.print("Introduzca el primer número: ");
        x=sw.nextDouble();
        System.out.print("Introduzca el segundo número:");
        y=sw.nextDouble();
        System.out.print("Introduzca la operación que quiere realizar +|-|*|/:");
        operacion=sw.next().charAt(0);
        
        switch(operacion){
            //suma
            case '+': System.out.println("la suma de estos números es:"+(x+y));
            break;
            //resta
            case '-': System.out.println("la resta de estos números es:"+(x-y));
            break;
            //multi
            case '*': System.out.println("la multiplicación de estos números es:"+(x*y));
            break;
            //división
            case '/': System.out.println("la división de estos números es:"+(x/y));
            break;
              
            default: System.out.println("no se encontro la respuesta");
              
        }
       
    }
    
}
