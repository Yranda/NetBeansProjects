/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaIII;

public class GradeBook_get_set {
    
    private String courseName;
    
    // ATRIBUIR/CONFIGURAR valores
    public void setCourseName(String name){
        courseName = name;
    }
    
    // GET obtém valores 
    public String getCourseName(){
        return courseName;
    }
    
    public void displayMessage(){
        System.out.printf("Bem vindo ao GradeBook \n%s!\n", getCourseName());
        
    }
    
}

//public pode ser acessado por todas as outras classes criadas.
//private só pode ser acessado pela mesma classe, ou onde ela foi feita.
// variável do tipo referencia ou primitiva, se não for um é outro.
//primitivo: boolean, byte, char, char, short, int, long, float,double.
// referencia: "GradeBook myGradeBook = new GradeBook();"