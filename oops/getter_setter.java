package oops;
// WE USED THE METHOD GETTER AND SETTER IN THE PROCESS OF THE MECHANISM FO THE ENCAPSULATION

class getter_setter{

    int rollno;
    public void setRollno(int r){
           this.rollno=r;
    }
    public int getRollno(){
        return rollno;
    }
    public static void main(String[] args) {
        getter_setter obj=new getter_setter();
        obj.setRollno(4);
        System.out.println("the roll no is: "+obj.getRollno());
    }
}