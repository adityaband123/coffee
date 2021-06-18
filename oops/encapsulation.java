package oops;
/*

definaiton:
          Encapsulation in java is a mechanism of the wrapping the data (variables) and code acting on the data(methods) together as a single unit


steps to achive encapsulation in java:
                                        1) declare the variables of a class as private
                                        2) provide public getter and setter methods to modify and view the variables


*/
 class encapsulation {
    private int emp_id; //---------------------this is called as data hiding , by declaring variables as private......
    

    public int getEmp_id() {
        return emp_id;
    }


    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }


    public static void main(String[] args) {
        encapsulation obj=new encapsulation();
        obj.setEmp_id(333);
        System.out.println(obj.getEmp_id());
        
    }
    
}
