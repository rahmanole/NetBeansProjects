
package class26;

/**
 *
 * @author OLEE
 */
class Outer{
    int x = 1;
    
    class Inner{
        void showMsg(){
            System.out.println("Inner class");
        }
    }
    
    void display(){
        Inner in = new Inner();
        in.showMsg();
    }
    
}


public class Nested {
    public static void main(String args []){
        Outer out = new Outer();
        out.display();
        
        Interface intf = new Interface();
        intf.et.eat();
    }
}
