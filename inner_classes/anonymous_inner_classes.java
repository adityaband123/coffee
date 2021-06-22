package inner_classes;
/*
 3) Anonymous inner classes:
                                 It is an inner class without a name and for which only a single object is created.
                                 An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overloading methods of a class or interface, without having to actually subclass a class
                                 In case to ovverride any method we can use the anonymous class.
*/

class outer{
    public void show(){
        System.out.println("this is the outer");
    }
}


// class inner extends outer{
//     public void show(){
//         System.out.println("this is the inner");
//     }
// }


public class anonymous_inner_classes {
    public static void main(String[] args) {
        outer obj=new outer(){                              // in this way we can create anonymous class
            public void show(){
             System.out.println("this is the anonymous class");
            }
        };
        obj.show();
        
    }
    
}
