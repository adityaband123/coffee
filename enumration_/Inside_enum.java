package enumration;

/*
NOTE:
     In java we can create variables and methods inside the enum ...at other side in other languge it is not  the case we are not able to create the methods and variables inside the enum

usefull methods in the enum in java:
                                    values(),  --->> it is usefull to print all the values of the constant present in the enum
                                    ordinal(), --->> by its use we can know the position number of the perticular constant
                                    valueOf()  --->> valueOf() method returns the enum constant of the specified enumtype with the specified name.
                                
*/
enum Classes{
    FIRST(33),SECOND,THIRD(223),FOURTH(45);
    int price;
    Classes(){
        price=20;
    }
    Classes(int n){
        price=n;
    }

    public int getPrice(){
        return price;
    }
}

public class Inside_enum {
    public static void main(String[] args) {
        System.out.println(Classes.THIRD.getPrice());

        System.out.println(Classes.THIRD.ordinal());
        Classes c[]=Classes.values();
        for(Classes classes: c){
            System.out.println(classes);
        }
        Classes result;
        result=Classes.valueOf("SECOND");
        System.out.println(result);
    }

}
    