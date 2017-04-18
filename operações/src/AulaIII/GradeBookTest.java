/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaIII;

import java.util.Scanner;

public class GradeBookTest {
    
    // inicia a execução do programa "main"
    public static void main(String[] args){
        
        // cria scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        // é criado um objeto gradebook e o mesmo é atribuido ao myGradeBook
        GradeBook myGradeBook = new GradeBook();
        
        System.out.println("Digite o nome do curso:");
        String nameOfCourse = input.nextLine();
        System.out.println();
        
        // chama método displayMessage de myGradeBook
        myGradeBook.displayMessage(nameOfCourse);
    }
    
}
