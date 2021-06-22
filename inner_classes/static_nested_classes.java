package inner_classes;



/*
4) Static nested classes:
                               Static nested classes are not technically an inner class. They are like a static member of outer class.

                               only inner classes can be declare as static
                               a normal class cannot be static class



                               Note: A static nested class interacts with the instance members of its outer class (and other classes) just like any other top-level class. 
                               In effect, a static nested class is behaviorally a top-level class that has been nested in another top-level class for packaging convenience.
                               There is no need for LinkedList.

 */

public class static_nested_classes {
    // we can use a static variable or static method directoly without creation of the boject with the help of the dot (.) like..class_name.var_name.

    static int var=3;
    public static void dis(){
        System.out.println("this is the dis method");
    }

    //we also can use static class with the parent class name
    //static inner class can access only static members  from the outer class but it is unable to access the outer members from the outer class
    static class nested{
        void inn(){
            System.out.println("this is the inn mehod in  the static class");
        }

    }
    public static void main(String[] args) {


    // NOTE: if main method is inside the static inner class then we can access  the method or the members of the inner static class like ...........inner obj=new inner();





        


        static_nested_classes.nested obj=new static_nested_classes.nested();    //we can declare the referance of the inner class with the help of the inner class
        obj.inn();
    }
    
    
}
