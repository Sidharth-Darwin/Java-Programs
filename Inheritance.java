/*
Write a Java program to which creates a class named College having the following members Name and Age. It should also has methods made SetName(), GetName() SetAge() and GetAge(), which stores the name and age. 
The class Employee inherits College, which should contain the members Employee ID and Salary. The class should contain the methods SetEmployeeID(), GetEmployeeID(), SetSalary() and GetSalary().
Now, assign the Name, Age, Employee ID and Salary to an employee by making an object for the class and print the same.
*/

class College{
    String name;
    int age;
    void set_name(String name){
        this.name = name;
    }
    String get_name(){
        return this.name;
    }
    void set_age(int age){
        this.age = age;
    }
    int get_age(){
        return this.age;
    }
}

class Employees extends College{
    int emp_id;
    int Salary;
    void set_emp_id(int emp_id){
        this.emp_id = emp_id;
    }
    int get_emp_id(){
        return this.emp_id;
    }
    void set_Salary(int Salary){
        this.Salary = Salary;
    }
    int get_Salary(){
        return this.Salary;
    }
}

public class Inheritance{

    public static void main(String args[]){
        Employees obj = new Employees ();
        obj.set_name("Sidharth D");
        obj.set_age(20);
       System.out.println(obj.get_name());
       System.out.println(obj.get_age());
       
       obj.set_emp_id(12546);
       obj.set_Salary(40000);    
       System.out.println(obj.get_emp_id());
       System.out.println(obj.get_Salary());
    }
}

