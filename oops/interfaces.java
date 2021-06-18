package oops;
import java.time.MonthDay;

/*
 English defination:
                    In english an interface is a point where two systems meet and interact with each other
    


Defination in java: 
                In java interface is a group of related methods with empty bodies
 




Syntax :

       *  In interface we use implement keyword in the interfaces

         interface interface_name { 
             // declare constant fields 
             // declare methods that abstract by default. 
            } 

      
     
      
    

  work:
        -- interface is the blueprint of the class 
         it specify what a class must do and not how




NOTES:
      --all method contain in an interface should abstract only
       no concreate method will allowed in the interface
    
     -- all the methods consit in an interface should be public abstract class

     --all the declaired fields(variables) in the interface should be
      public static final

      -- we cannot create object of the abstract method



uses:
    --it is useful in achiving abstraction
    --it supports multiple inheritance
    --it can be use to achive loose coupling


letest_version_updates:
                       --now in letest version from java_8 
                       we can use a concrete method inside the interface but
                       its access specifire/modefire should be default

                       --also we can use static method in the interface but with start 
                       with public access modefire only

                       --in the 9th version of the java devlopers has added that in interfaces
                       we can use default methods also

                      

*/

// ex:
interface Mark_Zuckerberg{
    public void show();
    static void mthd(){
        System.out.println("we can use an concrete method inside the interface but with static keyword");
    }

        
}
class Facebook{
    public void show(){
        System.out.println("this is the method inside the facebook");
    }
    public static void main(String[] args) { 
        //Mark_Zuckerberg m=new Mark_Zuckerberg();  //we cannot create an object of the interface..it will throw an error
        Facebook fb=new Facebook();
        fb.show();
     
        
    }
}

