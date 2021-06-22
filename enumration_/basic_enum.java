package enumration;

/*

Enumration=मोजणी
enum is the short form of the enumration

Enumration defination in java:
                              defination:
                                         The Enum in Java is a data type which contains a fixed set of constants.


uses fo enumration:
                   Enumerations serve the purpose of representing a group of named constants in a programming language. 

                   For example the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond, Heart, and Spade, belonging to an enumerated type named Suit. Other examples include natural enumerated types (like the planets, days of the week, colors, directions, etc.).

                   Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command line flags, etc.
                   
                   Note:
                       It is not necessary that the set of constants in an enum type stay fixed for all time.





                To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
                ex:
                   enum Level {
                          LOW,
                          MEDIUM,
                          HIGH
                        }
             In case to access the enum constants we need to use the dot syntax as below:
             Level myVar = Level.MEDIUM;
*/
enum programming_languges{
              JAVA,PYTHON,RUBY,KOTLIN;
       
}
public class basic_enum {
       public static void main(String[] args) {
            System.out.println(programming_languges.JAVA);
       
       }
}
