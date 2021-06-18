package exception_handling;


//costome exceptions:
                    //user can define his own exceptions 
class UndreAgeException extends Exception{
    UndreAgeException(){
        super("you are under age");
    }
    UndreAgeException(String message){
    super(message);
    }
}

public class userDefined_exception {
    public static void main(String[] args) throws UndreAgeException {
        int age=55;
        if(age<18){
            throw new UndreAgeException();
        }
        else{
         System.out.println("now you can vote");
        }
    }
    
}
