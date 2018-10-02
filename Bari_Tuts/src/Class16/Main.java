/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16;

/**
 *
 * @author OLEE
 */
public class Main {
    public static void main(String args[]){
        Child c = new Child("Salam", 10,28,"IT");
        System.out.println("Name = "+c.name);
        System.out.println("ID = "+c.ID);
        System.out.println("Age = "+c.age);
        System.out.println("Department = "+c.department);
    }
}
