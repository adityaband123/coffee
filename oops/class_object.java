package oops;
/*

class:
      A Class is like an object constructor, or a "blueprint" for creating objects.

NOTE: one java file can contains only one public method


*/

class adi{
   String name="aditya_band";
   int id=33;
   String village;
   public void print_details(){
       System.out.println("name: "+name);
       System.out.println("id: "+id);
       System.out.println("village: "+village);
   }

}
public class class_object {
    public static void main(String[] args) {
        System.out.println("this is our coustom_class ");

        adi obj=new adi();               // initializing the object for class adi as obj


        obj.village="pimparkhed";
              /* setting the properties / attribute ....we can        
                                      directly mention the property as above in the class  */    

        // System.out.println(obj.name);
        // System.out.println(obj.id);
        // System.out.println(obj.village);
        obj.print_details();



         
        adi obj2=new adi();
        obj2.print_details();
        obj2.name="tyrant";
        obj2.id=99;
        obj2.village="tyrannical_kingdom";
        obj2.print_details();

    }
    
}
