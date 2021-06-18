package oops;

/*
 In this concept of consturctor in inheritance:
                                               the following process is the constructor overloading 
                        when we create the object of  child class which extends the base class first of all
                        it will find that is their any fo the consturctor is present in the base class if thir...
                        then it will prints all the properties present in this constructor fo the base class

                    and if their is not any fo the consturcttor in the base then it will find the constructor in the derived class 
                    and prints its properties


                    

*/


class base{
    //  base(){
    //      System.out.println("i am the constructor in the base class");
    //  }

 }
 class derived extends base{
     derived(){
         System.out.println("i am the constructor in the derived class");
     }
     

 }
 class  constructor_in_java{
    public static void main(String[] args) {
        derived obj=new derived();
        
        
    }
}