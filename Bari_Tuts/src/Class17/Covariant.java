/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class17;

class SuperA{

    int x =1;
}

class SubB extends SuperA{
    int y = 2;
}

class Base{

    SuperA getObject(){
     return new SuperA();   
    }
}
public class Covariant extends Base {
    @Override
    SuperA getObject(){
        System.out.println("Covariant");
        return new SubB();
    }
}
