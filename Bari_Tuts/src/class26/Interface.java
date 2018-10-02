/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class26;

interface eatable{
    void eat();
}
public class Interface {
    
    
  eatable et = new eatable(){
      
      @Override
      public void eat() {
          System.out.println("Have been eaten");
      }
    };
}
