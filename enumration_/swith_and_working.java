package enumration;
enum fruits{
    MANGO,APPLE,BANANA,COCONUT;
}
//THIS IS WHATS HAPPEN BEHIND THE SCENE....

/*
class fruits{
    static final fruits MANGO=new fruits();
    static final fruits APPLE=new fruits();
    static final fruits BANANA=new fruits();
    static final fruits COCONUT=new fruits();
}



*/

public class swith_and_working {
    public static void main(String[]args){
        fruits f=fruits.MANGO;
       switch(f){
           case APPLE:
           System.out.println("this is the apple");
           break;
           case BANANA:
           System.out.println("this is the banana");
           break;
           case MANGO:
           System.out.println("this is the mango");
           break;
           default:
           System.out.println("this is not valid !!");
           }
       }
    }
