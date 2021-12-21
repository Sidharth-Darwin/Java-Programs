/* 
Write a java program which creates a class named Employee having the following members - name, age, phone number, address and salary. 
It also has a method named printSalary() which prints the salary of the Employee.
Two classes Officer and Manager inherits the Employee class, the Officer and Manager have data members specialisation and department respectively. 
Now assign them name, age, phone number, address and salary to an officer and manager by making an object of both of these classe and print the same.
*/

import java.util.Scanner;

class Employee{
	private String Name;
	private int Age;
	private long PhoneNumber;
	private String Address;
	private int Salary;
	void setName(String Name){
		this.Name = Name;
	}
		void setAge(int Age){
		this.Age=Age;
	}	
	void setPhoneNumber(long PhoneNumber){
		this.PhoneNumber = PhoneNumber;
	}	
	void setAddress(String Address){
		this.Address = Address;
	}	
	void setSalary(int Salary){
		this.Salary = Salary;
	}
	void printSalary(){
		System.out.println("The salary is "+Salary);
	}
	String getName(){
		return this.Name;
	}
	int getAge(){
		return this.Age;
	}
	long getPhoneNumber(){
		return this.PhoneNumber;
	}
	String getAddress(){
		return this.Address;
	}
	int getSalary(){
		return this.Salary;
	}
}

class Officer extends Employee{
	private String specialisation;
	void setSpecialisation(String specialisation){
		this.specialisation = specialisation;
	}
	String getSpecialisation(){
		return specialisation;
	}
}

class Manager extends Employee{
	private String department;
		void setDepartment(String department){
		this.department = department;
	}
	String getDepartment(){
		return department;
	}
}

public class heirarchy{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Officer of = new Officer();
		Manager ma = new Manager();
		// Entering values into Office object
		System.out.print("Enter Name of Officer: ");
		of.setName(sc.nextLine());
		System.out.print("Enter Age of Officer: ");
		of.setAge(Integer.parseInt(sc.nextLine()));
		System.out.print("Enter phone number of Officer: ");
		of.setPhoneNumber(Long.parseLong(sc.nextLine()));
		System.out.print("Enter address of Officer: ");
		of.setAddress(sc.nextLine());
		System.out.print("Enter Salary of Officer: ");
		of.setSalary(Integer.parseInt(sc.nextLine()));
		System.out.print("Enter Specialisation of Officer: ");
		of.setSpecialisation(sc.nextLine());
		// Displaying values in Office object
		System.out.println(of.getName());
		System.out.println(of.getAge());
		System.out.println(of.getPhoneNumber());
		of.printSalary();
		System.out.println(of.getSpecialisation());
		// Entering values into Manager object
		System.out.print("Enter Name of Manager: ");
		ma.setName(sc.nextLine());
		System.out.print("Enter Age of Manager: ");
		ma.setAge(Integer.parseInt(sc.nextLine()));
		System.out.print("Enter phone number of Manager: ");
		ma.setPhoneNumber(Long.parseLong(sc.nextLine()));
		System.out.print("Enter address of Manager: ");
		ma.setAddress(sc.nextLine());
		System.out.print("Enter Salary of Manager: ");
		ma.setSalary(Integer.parseInt(sc.nextLine()));
		System.out.print("Enter Department of Manager: ");
		ma.setDepartment(sc.nextLine());
		// Displaying values in Office object
		System.out.println(ma.getName());
		System.out.println(ma.getAge());
		System.out.println(ma.getPhoneNumber());
		ma.printSalary();
		System.out.println(ma.getDepartment());
	}
}
