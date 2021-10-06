
package com.mycompany.sentenciasdecontrol;

import java.util.Scanner;

public class IfElseAnidado {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
        int Calificacion ;
     Calificacion =sc.nextInt();
     if (Calificacion >= 90)
            System.out.println("A");
     
     else
     if (Calificacion >= 80)
            System.out.println("B");
     
     else
     if (Calificacion >= 70)
            System.out.println("C");
     
     else
     if (Calificacion >= 60)
            System.out.println("D");
     
     else
            System.out.println("F");
     
    }
    
}
