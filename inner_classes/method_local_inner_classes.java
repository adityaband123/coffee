package inner_classes;
/*
 2) Method Local inner classes:
                                    The class which is defined in the method block of the outer class is called as the  method local inner class

                                    Local Inner Classes are the inner classes that are defined inside a block.
                                    Generally, this block is a method body. ...
                                    These class have access to the fields of the class enclosing it. 
                                    Local inner class must be instantiated in the block they are defined in.




*/


class outer {
    public void method_of_outer_class(){
        System.out.println("this is the method of the outer class");
        class inner{
            void method_of_inner_class(){
                System.out.println("this is the method of the inner class");
            }
        }
        inner obj=new inner();
        obj.method_of_inner_class();
    }
}
class Main{
    public static void main(String[] args) {
        outer object=new outer();
        object.method_of_outer_class();
    }
}
