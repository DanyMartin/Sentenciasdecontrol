
package com.mycompany.sentenciasdecontrol;

import java.util.Scanner;

public class IFelse {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        int Calificacion ;
     Calificacion =sc.nextInt();
     if (Calificacion >= 60)
            System.out.println("Aprobado");
     
     else
            System.out.println("Reprobado");   
    }
    
}
