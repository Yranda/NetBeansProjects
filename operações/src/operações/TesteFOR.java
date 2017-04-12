/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operações;

import java.util.Scanner;

    public class TesteFOR{
        
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            int x;
            System.out.println("Digite o valor de x:");
            
            for (x=0; x<2;){
                if (x == 1)
                    System.out.printf("Se o valor for um, estará correto:" ,x);           
            }
        }
    }


