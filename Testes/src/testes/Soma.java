/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import javax.swing.JOptionPane;

public class Soma {

    public static void main(String[] args) {
        
        int soma;
        int num1 = 0; int num2 = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero:"));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero:"));
        
        soma = num1 + num2;
        
        JOptionPane.showMessageDialog(null,"A soma dos numeros e :" + soma);
        
        System.exit(0);
        
    }
    
}
