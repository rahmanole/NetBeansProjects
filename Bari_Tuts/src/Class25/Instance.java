
package Class25;

class SuperA{

    int x=1;
    
}

class SubB extends SuperA{
    int y= 4;
    
}

class Base {

    SuperA getObject(){
        System.out.println("Base");
        return new SuperA();
    }
}

/*
getObject method shows run time polymorphism.
when it is overrided,test object will call the overridden method
if it is not overridden then base class method will be called.
*/

public class Instance extends Base {
    public static void main(String args[]){
        Base test  = new Instance();
        System.out.println(test.getObject() instanceof SubB );
        System.out.println(test.getObject().x);
    }
    
    @Override
    SuperA getObject(){
        System.out.println("CovariantReturn");
        return new SubB();
    }
    
    
}
