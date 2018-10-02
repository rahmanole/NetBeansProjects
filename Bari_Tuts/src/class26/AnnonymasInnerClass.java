/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class26;

/**
 *
 * @author OLEE
 */
abstract class AnnonymasInnerClass {
    abstract void eat();
    
     public static void main(String args []){
         
        new AnnonymasInnerClass() {
            
            @Override
            void eat() {
                 System.out.println("Annonymas inner class");
            }
            
        }.eat();
        
    }
}


