package inner_classes;
/*

1) Nested Inner class:
                            class inside anoter class
                            Nested Inner class can access any private instance variable of outer class.
                            Like any other instance variable, we can have access modifier private, protected, public and default modifier.
                            Like class, interface can also be nested and can have access specifiers.

                            we cannot create any static method inside the inner class.

*/
class Outer{
    class Inner{
        public void show(){
            System.out.println("this is the inner class");
        }
    }
}
class Main_{
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();    
    }
}