package oops;
/*
defination: 
          The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
          (in simple with the help of the access modefires we can be set the scope of the perticular method that from where it should be accessiable and from where should not)


types: 

      Default: – [ No keyword required.]
             The scope of the default access modifier lies within the package

      Private:
             The methods or data members declared as private are accessible only within the class in which they are declared. Any other class of the same package will not be able to access these members.

      Protected.
               When a variable, method or constructor that are declared protected in a superclass can be accessed only by the subclasses in other package or any class within the package of the protected members' class  
                
      Public:
             The methods or data members declared as public can be accessiable from anywhere
                  
             


    

*/
class employee{
    private String name;
    private int id;
}
public class access_modefires {
    public static void main(String[] args) {
        employee obj=new employee();

        // obj.name="adi"; //because of the methods are private these two line gives us error..cause    private methods can be accessiable within same class only
        // obj.id=33;
        
        
    }
}
  
