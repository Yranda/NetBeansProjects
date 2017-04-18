/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaII;

import java.util.Scanner;

public class ComparandoInteiro {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1; int num2;
        
        System.out.print("Digite um numero:");
        num1 = entrada.nextInt();
        
        System.out.print("Digite um numero:");
        num2 = entrada.nextInt();
        
       if (num1 > num2){
           System.out.printf("%d é maior", num1);
       }
       else {
           System.out.printf("%d é menor", num2);
       }
                  
    }
           
}
