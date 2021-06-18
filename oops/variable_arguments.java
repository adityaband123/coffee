package oops;

/*
defination: 
           Varargs is a short name for variable arguments. In Java, an argument of a method can accept arbitrary number of values. This argument that can accept variable number of values is called varargs.

syntax :
        datatype method_name(datatype ...arr){
            method_body
        }
        
*/


class adii{
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the result is :"+sum(3,3));
        System.out.println("the second result is : "+sum(33,3,3,3,3));
        

    }
}