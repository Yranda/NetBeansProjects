/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaIII;

import java.util.Scanner;

public class GradeBookCompleto {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        GradeBook myGradeBook = new GradeBook();
        System.out.printf("Inicial do nome:", myGradeBook.getCourseName());
        
        System.out.println("Escreve o nome do curso");
        String theName = input.nextLine();
        myGradeBook.setCourseName(theName);
        System.out.println();
        
        myGradeBook.displayMessage();
        
    }
    
}
