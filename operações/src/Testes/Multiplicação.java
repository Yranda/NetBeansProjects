/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import javax.swing.JOptionPane;

public class Multiplicação {
    
    public static void main(String[] args) {
        
        int mult;
        int num1 = 0; int num2 = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite um numero:"));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite um numero:"));
        
        mult = num1 * num2;
        
        //JOptionPane.showMessageDialog(null,"a multiplicação dos numeros é:" * mult);
       
         System.exit(0);
        
    }
    
}
