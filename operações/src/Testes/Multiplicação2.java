/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import java.util.Scanner;

public class Multiplicação2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1; int num2;
        
       System.out.print("Digite o primeiro numero");
       num1 = entrada.nextInt();
       
       System.out.print("Digite outro numero");
       num2 = entrada.nextInt();
       
       System.out.printf("\n%d + %d = %d\n", num1, num2, num1 + num2);
       System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
       System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
       
    }
    
}
